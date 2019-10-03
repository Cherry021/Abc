package com.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.beans.Student;

@Service
public class MyService {
	static List<Student> sl;
	static {
		 sl=Arrays.asList(new Student(1, "Sarath"),
				new Student(2, "Saringann"),
				new Student(3, "Maya"),
				new Student(4, "varun"),
				new Student(5, "mayor"));
	}
	
	public Optional<Student> getStudent(int id) {
		 return sl.stream().filter(itm -> itm.getId()==id).findAny();
	}

}
