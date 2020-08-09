package com.andy.helloworld.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.andy.helloworld.repository.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	//required method for this example
	Optional<User> findByUsername(String username);
}
