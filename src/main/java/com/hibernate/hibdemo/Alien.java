package com.hibernate.hibdemo;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Column;
import javax.persistence.Entity;

//@Entity
@Entity(name="alien_table")
@Table(name= "alien_table_tablename")
public class Alien {
	@Id
	@Column(name="alien_id")
	private int aid;
	@Transient
	@Column(name="alien_name")
	private String aname;
	@Column(name = "alien_marks")
	private int amarks;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public int getAmarks() {
		return amarks;
	}
	public void setAmarks(int amarks) {
		this.amarks = amarks;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", amarks=" + amarks + "]";
	}
}
