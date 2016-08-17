package rest;


import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import repository.ClientRepository;
import entity.Client;


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
    	return Response.ok(clientRepository.findAll()).build();
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

