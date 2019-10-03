package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.User;
import com.implies.ConService;

@RestController
public class ConController {
	@Autowired
	private ConService cs;

	@GetMapping("/sas/{id}")
	public User getUserDetails(@PathVariable("id") long id) {
		System.out.println("getUserDetails   "+id);
		return cs.getUser(id); 
	}
}
