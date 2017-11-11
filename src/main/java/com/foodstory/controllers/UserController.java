package com.foodstory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodstory.domains.User;
import com.foodstory.repositories.UserRepository;

@RestController
@RequestMapping(path = "api/user")
public class UserController {
	
	@Autowired 
	private UserRepository userRepository;

	@GetMapping(path = "/login")
	public @ResponseBody String register(@RequestParam String fbLogin, @RequestParam String name, @RequestParam String email) {
		
		User user = userRepository.findByfbLogin(fbLogin);
		
		if(user == null) {
			User newUser = new User();
			newUser.setFbLogin(fbLogin);
			newUser.setEmail(email);
			newUser.setName(name);
			userRepository.save(newUser);
			
			return "Saved";
		}
		return "Logged In";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}