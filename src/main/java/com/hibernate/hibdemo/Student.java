package com.hibernate.hibdemo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private int marks;
//	@OneToMany(mappedBy="student")
//	@ManyToMany
	@ManyToMany(mappedBy="student")
	private List<Laptop> laptops = new ArrayList<Laptop>();
	
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
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public List<Laptop> getLaptop() {
		return laptops;
	}
	public void setLaptop(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	
}
