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
	public @ResponseBody String register(@RequestParam String name, @RequestParam String email, @RequestParam String phone) {

		//contactRepository.save(n);
		return "Saved";
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}