package app.jz.rest.inf;

import javax.ws.rs.core.Response;

public interface UserService {
	
	/**
	 * Get the user information by name
	 * @param name
	 * @return
	 */
	public Response getUser(String name);
	
	/**
	 * Get all of the users
	 * @return
	 */
	public Response getAllUsers();
	

}
