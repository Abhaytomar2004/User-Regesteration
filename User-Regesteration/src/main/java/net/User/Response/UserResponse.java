package net.User.Response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponse {
	private int id ;
	private String Username ; 
	private String email ; 
	private String password ;
	public UserResponse(int id, String username, String email, String password) {
		super();
		this.id = id;
		Username = username;
		this.email = email;
		this.password = password;
	}
	public UserResponse() {
		super();
		// TODO Auto-generated constructor stub
	} 

}
