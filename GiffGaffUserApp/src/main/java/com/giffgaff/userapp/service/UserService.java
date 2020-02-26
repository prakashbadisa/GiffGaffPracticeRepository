package com.giffgaff.userapp.service;

import java.util.List;
import java.util.Optional;

import com.giffgaff.userapp.model.User;

public interface UserService {

	void addUser(User user);

	List<User> getListOfUsers();

	void deleteById(Long id);
	
	Optional<User> getUserById(Long userid);
	
	void updateUserById(User user);

}
