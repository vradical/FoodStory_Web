package com.foodstory.controllers;

import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;
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
	public @ResponseBody Response register(@RequestParam String fbLogin, @RequestParam String name, @RequestParam String email) {
		
		User user = userRepository.findByfbLogin(fbLogin);
		
		if(user == null) {
			User newUser = new User();
			newUser.setFbLogin(fbLogin);
			newUser.setEmail(email);
			newUser.setName(name);
			userRepository.save(newUser);
			
	        JSONObject obj = new JSONObject();
	        try {
				obj.put("Status", "NewUser" );
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return Response.ok(obj).build();
		}
		return Response.ok().build();
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}