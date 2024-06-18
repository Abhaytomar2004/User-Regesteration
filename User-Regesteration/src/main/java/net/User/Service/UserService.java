package net.User.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.User.Entity.User;
import net.User.ExceptionHandling.UserAlreadyExistsException;
import net.User.ExceptionHandling.UserNotFoundException;
import net.User.Repository.UserRepository;
import net.User.Response.UserResponse;
@Service
public class UserService  {
	@Autowired
	private UserRepository userRepository; 
	public void registerUser(User user) {
//		userRepository.saveUser(user.getUsername(), user.getEmail(), user.getPassword());
		if(userRepository.findByUsername(user.getUsername())!=null) {
			throw new UserAlreadyExistsException("User already exists with username: " + user.getUsername());
		}
		userRepository.save(user);
	}
	public User fetchUser(String username) {
		User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UserNotFoundException("User not found with username: " + username);
        }
        return user;
    }
    }



