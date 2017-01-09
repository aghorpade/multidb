package com.example.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.user.User;
import com.example.repository.user.UserRepository;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

	@Autowired
	public UserRepository userRepo;

	// REST APi to create user/save user in database
	@RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
	public User createUser() {
		User user=new User();
		user.setName("amit");
		user.setEmail("amit12@gmail.com");
		user.setAge(12);
		return userRepo.save(user);
	}


	// REST API to get all users
	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<User> getAllUsers() {

		return userRepo.findAll();

	}
}