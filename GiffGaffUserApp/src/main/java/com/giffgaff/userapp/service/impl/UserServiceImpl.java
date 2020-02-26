package com.giffgaff.userapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.giffgaff.userapp.dao.UserServiceDAO;
import com.giffgaff.userapp.model.User;
import com.giffgaff.userapp.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	UserServiceDAO userServicedao;

	@Override
	public void addUser(User user) {
		userServicedao.save(user);
	}

	@Override
	public List<User> getListOfUsers() {
		List<User> user;
		return user = (List<User>) userServicedao.findAll();

	}
	
	public void deleteById(Long id) {
		userServicedao.deleteById(id);
	}
	
	public Optional<User> getUserById(Long userid) {
		Optional<User> user;
		return user =  userServicedao.findById(userid);
		
	}
	
	public void updateUserById(User user) {
		userServicedao.save(user);
	}

}
