package app.jz.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import app.jz.rest.inf.UserService;

@Path("/user")
@Produces("application/json")
public class UserServiceImpl implements UserService {
	
	
	

	@GET
	@Path("/{param}")
	public Response getUser(@PathParam("param") String name) {
		String result = "User Name: " + name;

		return Response.status(200).entity(result).build();
	}

	@GET
	@Path("/")
	public Response getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
