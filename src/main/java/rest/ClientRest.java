package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class ClientRest {

	@GET
    @Produces("text/plain")
    public String handleGreeting() {
    	return "Tiago";
    }

}
