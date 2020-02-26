package com.giffgaff.userapp.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.giffgaff.userapp.model.User;
import com.giffgaff.userapp.service.UserService;

public class UserCommandLineRunner implements CommandLineRunner {

	@Autowired
	UserService userService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		//Add users to user table
		userService.addUser(new User("Prakash", "SSE", new Date()));
		userService.addUser(new User("Prakash", "SSE", new Date()));
		userService.addUser(new User("Sandeep", "SSA", new Date()));
		userService.addUser(new User("Raj", "SS", new Date()));
		userService.addUser(new User("Vipul", "SA", new Date()));
		userService.addUser(new User("Ramana", "SA", new Date()));

		// get list of users from database
		List<User> userObj = userService.getListOfUsers();
		User user1 = new User();
		user1.setUserid(userObj.get(2).getUserid());
		user1.setUsername("Sandeep");
		user1.setRole("Engineer");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date dob = sdf.parse("26-07-1987");
		user1.setDob(dob);
		//update user 
		userService.addUser(user1);

		// Delete user from database based on id
		userService.deleteById(userObj.get(1).getUserid());

	}

}
