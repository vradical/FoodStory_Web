package com.foodstory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.foodstory.domains.Hawker;
import com.foodstory.repositories.HawkerRepository;

@RestController
@RequestMapping(path = "api/hawker")
public class HawkerController {

	@Autowired 
	private HawkerRepository hawkerRepository;
	
	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Hawker> getAllHawker() {
		return hawkerRepository.findAll();
	}

}
