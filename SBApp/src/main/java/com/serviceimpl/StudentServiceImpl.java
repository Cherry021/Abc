package com.serviceimpl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.beans.Student;
import com.repository.StudentRepo;
import com.service.StudentService;

public class StudentServiceImpl implements StudentService{
	@Autowired
	StudentRepo sr;
	public ArrayList<Student> getStuDet(Long id) {
		ArrayList<Student> sl = sr.getStuDet(id);
		return sl;
	}

}
