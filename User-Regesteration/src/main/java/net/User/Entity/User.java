package net.User.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
public class User {
	@Id
	private String Username ; 
	private String email ; 
	private String password ;
	public User( String username, String email, String password) {
		super();
		
		Username = username;
		this.email = email;
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	} 
	

	
}
