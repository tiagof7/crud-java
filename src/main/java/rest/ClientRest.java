package rest;


import java.util.List;

//import javax.inject.Inject;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.crudjava.entity.Client;
import com.crudjava.repository.ClientRepository;


//@Path("client")
//@Produces(MediaType.APPLICATION_JSON)
public class ClientRest {
	
	/* @Autowired
	private ClientRepository clientRepository; 

	@GET
    public Response getClients() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
		
		return Response.ok(clients).build();
    	
    	
//    	Connection connection = null;
//        Map<String, Object> attributes = new HashMap<>();
//        try {
//          connection = DatabaseUrl.extract().getConnection();
//
//          Statement stmt = connection.createStatement();
//          stmt.executeUpdate("CREATE TABLE IF NOT EXISTS ticks (tick timestamp)");
//          stmt.executeUpdate("INSERT INTO ticks VALUES (now())");
//          ResultSet rs = stmt.executeQuery("SELECT tick FROM ticks");
//
//          ArrayList<String> output = new ArrayList<String>();
//          while (rs.next()) {
//            output.add( "Read from DB: " + rs.getTimestamp("tick"));
//          }
//
//          attributes.put("results", output);
//          return Response.ok(new Gson().toJson( attributes)).build();
//        } catch (Exception e) {
//          attributes.put("message", "There was an error: " + e);
//          return Response.ok(new Gson().toJson( attributes)).build();
//        } finally {
//          if (connection != null) try{connection.close();} catch(SQLException e){}
//        }
    }
*/
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

