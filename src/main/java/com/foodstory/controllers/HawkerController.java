package com.foodstory.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping(path = "/get/{hawkerId}")
	public @ResponseBody Hawker getHawker(@PathVariable("hawkerId") Long hawkerId) {
		return hawkerRepository.findOne(hawkerId);
	}
	
	@PostMapping(path = "/add")
	public @ResponseBody Hawker addHawker(@RequestParam("name") String name, 
			@RequestParam("email") String email, @RequestParam("phone") String phone,
			@RequestParam("address") String address, @RequestParam("website") String website,
			@RequestParam("description") String description, @RequestParam("story") String story,
			@RequestParam("cover") String coverPhoto, @RequestParam("store") boolean store,
			@RequestParam("delivery") boolean delivery) {
		
		Hawker hawker = new Hawker();
		hawker.setName(name);
		hawker.setEmail(email);
		hawker.setPhone(phone);
		
		//set address
		//hawker.setAddLat(0);
		//hawker.setAddLong(0);
		
		hawker.setWebsite(website);
		hawker.setDescription(description);
		hawker.setStory(story);
		hawker.setCoverPhoto(coverPhoto);
		hawker.setStore(store);
		hawker.setDelivery(delivery);
		
		Hawker newHawker = hawkerRepository.save(hawker);
		
		return newHawker;
	}
}
