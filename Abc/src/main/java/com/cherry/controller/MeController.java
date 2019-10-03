package com.cherry.controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cherry.bean.Me;

@RestController
public class MeController {
	@RequestMapping("/home")
	public List<Me> getAll() {
		return Arrays.asList(
				new Me(1,"maya"),
				new Me(2,"maya1"),
				new Me(3,"maya2"),
				new Me(4,"maya3")
				); 
	}
}
