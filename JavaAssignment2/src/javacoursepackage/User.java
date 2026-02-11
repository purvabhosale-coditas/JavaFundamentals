package javacoursepackage;

import java.io.Serializable;

public class User implements Serializable{
	
	private String username;
	private transient String password;
	private String email;
	
	public User (String username, String password, String email){
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	public String toString() {
		return "User [Username:" + username + " Password:" + password + " Email:" + email + "]";
	}

}
