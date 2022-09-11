package com.revature.dao;

import java.util.Set;

import com.revature.model.User;

public interface UserDaoInterface {
	
	//Add User
	public int createUser(User user);
	
	//Display all Users
	Set<User> getAllUser();
	
	//Read username
	void readUsername(String username);
	
	//If User exist
	boolean existingUser(String username, String password);
	
	//Delete User
	void deleteUser(User user);
}
