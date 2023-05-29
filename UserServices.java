package com.Validation_ResponseWrapper.services;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.Validation_ResponseWrapper.models.User;

@Service
public class UserServices {
	
	Map<Integer, User> userMap = new HashMap();
	
	AtomicInteger atomicInteger = new AtomicInteger();
	
	
	public Collection<User> getUsers() {
		
		return userMap.values();	
		
	}
	
	public User getUsersById(int id) {
		User user  = userMap.get(id);
		
		if(user == null) {
			System.out.println("No such user exists");
		}
		
		return user;	
		
	}
	
	public String writeUser(User user) {
		int id = atomicInteger.incrementAndGet();
		user.setId(id);
		userMap.put(id, user);
		return "New user added successfully";		
	}
	
	public String updateUserById(int id, User user) {
		getUsersById(id);
		user.setId(id);
		userMap.put(id, user);
		
		return "User updated successfully";
	}
	
	public String deleteUserById(int id) {
		
		userMap.remove(id);
		
		return "User deleted successfully";
		
		
	}

}
