package com.cherry.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cherry.Me;

@RestController
public class MyController {
	@GetMapping
	@RequestMapping(value="/mine")
	public List<Me> getMine(){
		return Arrays.asList(
				new Me(1,"MySub"),
				new Me(2,"Mymath"),
				new Me(3,"Mycurrency"),
				new Me(4,"MyNote")
				);
	}
	
	@GetMapping
	@RequestMapping(value="/mines")
	public String getMines(){
		return "Hi";
	}
}
