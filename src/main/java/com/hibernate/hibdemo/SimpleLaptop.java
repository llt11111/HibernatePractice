package com.hibernate.hibdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="simple_laptop")
public class SimpleLaptop {
	@Id
	private int id;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "SimpleLaptop [id=" + id + ", brand=" + brand + "]";
	}
	
	

}
