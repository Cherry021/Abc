package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.beans.Student;

@Service
public interface StudentService {
	
	ArrayList<Student> getStuDet(Long id);
}
