package common;

/**
 * contains data about an active user which is currently logged in to the system 
 *
 */
public class ActiveUser {
	private User user;
	private String userType;

	public ActiveUser(User user) {
		this.user = user;
		userType = user.getClass().getName();
	}

	public String getUserType() {
		return userType;
	}

}
