package net.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.User.Entity.User;
import net.User.Response.UserResponse;
import net.User.Service.UserService;

@Controller
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService ; 
	   @PostMapping("/register")
	    public ResponseEntity<String> registerUser(@RequestBody User user) {
		   userService.registerUser(user);
	        return ResponseEntity.ok("User registered successfully");
	    }
	@GetMapping("/fetch/{username}")
	public ResponseEntity<User> UserRegesteration(@PathVariable String username){
		User user = userService.fetchUser(username);
        return ResponseEntity.ok(user);
		
		
	}
	
}
