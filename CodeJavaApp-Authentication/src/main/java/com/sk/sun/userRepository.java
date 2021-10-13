package com.sk.sun;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface userRepository extends JpaRepository<User, Long>{
	@Query("SELECT u FROM User u where u.email = ?1")
	User findByEmail(String email);

	
	
}
