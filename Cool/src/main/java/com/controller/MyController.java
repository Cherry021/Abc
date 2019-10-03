package com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.beans.Student;
import com.service.MyService;

@RestController
public class MyController {
	@Autowired
	private MyService service;
	@GetMapping("/det/{detNum}")
	public Optional<Student> getStuDet(@PathVariable("detNum") int detNum){
		return service.getStudent(detNum);
	}
}
