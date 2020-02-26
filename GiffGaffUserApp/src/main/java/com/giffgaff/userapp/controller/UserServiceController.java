package com.giffgaff.userapp.controller;

import java.sql.SQLException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.giffgaff.userapp.model.MessageBean;
import com.giffgaff.userapp.model.User;
import com.giffgaff.userapp.service.UserService;

@RestController
public class UserServiceController {

	@Autowired
	UserService userService;

	@PostMapping("/adduser")
	@ResponseStatus(value = HttpStatus.CREATED)
	public ResponseEntity<String> addUser(@RequestBody User user) {
		userService.addUser(user);
		return new ResponseEntity<String>("User details are " + user.getUserid(), HttpStatus.CREATED);
	}

	@DeleteMapping("/deleteuser/{id}")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<String> deleteById(@PathVariable Long id) {
		userService.deleteById(id);
		return new ResponseEntity<String>("User details are " + id, HttpStatus.CREATED);
	}

	@GetMapping("/getuser/{userid}")
	@ResponseStatus(value = HttpStatus.OK)
	public Optional<User> getUser(@PathVariable Long userid) {
		Optional<User> user;
		return user = userService.getUserById(userid);

	}

	@PutMapping("/updateuser")
	@ResponseStatus(value = HttpStatus.OK)
	public ResponseEntity<String> updateUserById(@RequestParam User user) {
		userService.updateUserById(user);
		return new ResponseEntity<String>("User details are " + user.getUserid(), HttpStatus.OK);
	}

	@ExceptionHandler({ SQLException.class, DataAccessException.class })
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "ERROR ON SERVER")
	public ResponseEntity<MessageBean> handleDatabaseError() {
		return new ResponseEntity<MessageBean>(new MessageBean("Database Error", "DBERR"),
				HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
