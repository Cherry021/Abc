package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beans.Student;
import com.service.StudentService;

@RestController
@RequestMapping("/students")
public class MyController {
	@Autowired
	private StudentService ss;
	@GetMapping("/getStuDet/{StuId}")
	public ArrayList<Student> getStuDet(@PathVariable("StuId") Long id){
		return ss.getStuDet(id);
	}
}
