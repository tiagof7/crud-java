package com.crudjava.repository;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
//	@Autowired
//	@Qualifier("Client")
//	private ClientRepository clientRepository; 

	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/teste")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {
		return Response.ok(true).build();
    }

}
