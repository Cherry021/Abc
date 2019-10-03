package com.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beans.Student;

public interface StudentRepo extends JpaRepository<Student, Long>{
	ArrayList<Student> getStuDet(long id);
}
