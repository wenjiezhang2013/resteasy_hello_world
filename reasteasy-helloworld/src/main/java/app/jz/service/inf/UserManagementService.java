package app.jz.service.inf;

import java.util.List;

import app.jz.model.User;

public interface UserManagementService {
	/**
	 * Find user by name
	 * @param name
	 * @return
	 */
	public User getUser(String name);

	/**
	 * Get the all of the users
	 * @return
	 */
	public List<User> getAllUsers();
}
