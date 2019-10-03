package com.beans;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private ArrayList<Integer> sub;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Integer> getSub() {
		return sub;
	}
	public void setSub(ArrayList<Integer> sub) {
		this.sub = sub;
	}
	public Student(int id, String name, ArrayList<Integer> sub) {
		super();
		this.id = id;
		this.name = name;
		this.sub = sub;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
