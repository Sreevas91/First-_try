package com.cts.training.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.training.bean.User;
import com.cts.training.repository.UserRepository;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserResourse {

	@Autowired
	private UserRepository userRepository;
	//http:localhost:8000/api/users
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable Long id){
		Optional<User> user= userRepository.findById(id);
		return new ResponseEntity<>(user,HttpStatus.FOUND);
	    
	}
	
	@GetMapping("/users/address/{address}")
	public ResponseEntity<List<User>> getUserByAddress(@PathVariable String address){
List<User> user = userRepository.findByAddress(address);
return new ResponseEntity<>(user,HttpStatus.FOUND);	
}
	
	
	
	@DeleteMapping("/users{id}/")
	public void deleteUser(@PathVariable Long id){
		
	userRepository.deleteById(id);
		
	
	}
	
	
	public User createUser(@RequestBody User user) {
		User savedUser = userRepository.save(user);
		return savedUser;
	}
	
	
	
	
	
	
}
