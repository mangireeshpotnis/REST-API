package com.Validation_ResponseWrapper.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Validation_ResponseWrapper.models.User;
import com.Validation_ResponseWrapper.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserServices userServices;
	
	@GetMapping("")
	public Collection<User> getUsers() {
		return userServices.getUsers();		
	}
	
	@GetMapping("/{id}")
	public User getUsersById(@PathVariable int id) {		
		return userServices.getUsersById(id);	
	}
	
	@PostMapping("")
	public String addUsers(@RequestBody User user) {
		return userServices.writeUser(user);
		
	}
	
	@PutMapping("/{id}")
	public String updateUserById(@PathVariable int id,User user) {
		return userServices.updateUserById(id, user);
		
	}
	
	@DeleteMapping("/{id}")
	public String deleteUserById(@PathVariable int id) {
		return userServices.deleteUserById(id);
		
		
		
	}

}
