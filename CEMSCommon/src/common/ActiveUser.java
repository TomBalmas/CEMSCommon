package common;

public class ActiveUser  {
	private User user;
	private String userType;
 
	public ActiveUser(User user) {
		this.user = user;
		userType= user.getClass().getName();
	}
	public String getUserType() {
		return userType;
	}
	 

}
