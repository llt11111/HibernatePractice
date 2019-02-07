package com.hibernate.hibdemo;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="alien_cache")
//@Cacheable
//@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class AlienCache {

	@Id
	private int id;
	private String name ;
	private String sex;
	
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "AlienCatch [id=" + id + ", name=" + name + ", sex=" + sex + "]";
	}
}
