package com.Validation_ResponseWrapper.models;

public class User {
	int id;
	String user_name;
	int age;
	String phone;

	public User(){

	}
	public User(int id, String user_name, int age, String phone) {

		this.id = id;
		this.user_name = user_name;
		this.age = age;                                     
		this.phone = phone;
	}
 
	
	
	
	public int getId() {                        
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}



}
