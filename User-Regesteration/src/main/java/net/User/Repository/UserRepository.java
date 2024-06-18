package net.User.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import net.User.Entity.User;

public interface UserRepository extends JpaRepository<User,String> {
	 @Query(value = "SELECT * FROM User WHERE username = :username", nativeQuery = true)
	   public  User findByUsername(@Param("username") String username);
	

}
