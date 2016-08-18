package rest;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.heroku.sdk.jdbc.DatabaseUrl;

import repository.ClientRepository;
import spark.ModelAndView;


@Path("client")
@Produces(MediaType.APPLICATION_JSON)
public class ClientRest {
	
	@Inject
	private ClientRepository clientRepository; 

	@GET
    public Response getClients() {
		//List<Client> clients = new ArrayList<Client>();
		//clients = clientRepository.findAll();
//		clients.add(new Client());
    	
    	
    	Connection connection = null;
        Map<String, Object> attributes = new HashMap<>();
        try {
          connection = DatabaseUrl.extract().getConnection();

          Statement stmt = connection.createStatement();
          stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
          stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
          ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");

          ArrayList<String> output = new ArrayList<String>();
          while (rs.next()) {
            output.add( "Read from DB: " + rs.getTimestamp("tick"));
          }

          attributes.put("results", output);
          return Response.ok(new Gson().toJson( attributes)).build();
        } catch (Exception e) {
          attributes.put("message", "There was an error: " + e);
          return Response.ok(new Gson().toJson( attributes)).build();
        } finally {
          if (connection != null) try{connection.close();} catch(SQLException e){}
        }
    }

}

/*@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ClientRest {

	@GET
    @Produces("text/plain")
    public String handleGreeting() {
    	return "Tiago";
    }

}*/

