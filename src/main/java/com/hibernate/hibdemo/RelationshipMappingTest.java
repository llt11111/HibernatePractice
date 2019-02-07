package com.hibernate.hibdemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class RelationshipMappingTest {
	public static void main(String[] args) {
		List<Laptop> laptops = new ArrayList<Laptop>();
		
		
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		
		Laptop laptop = new Laptop();
		laptop.setId(101);
		laptop.setName("Dell");
		laptops.add(laptop);
		
		student.setId(101);
		student.setName("lalit");
		student.setMarks(60);
		student.setLaptop(laptops);
		
		laptop.setStudent(students);
		Configuration conf = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//		ServiceRegistry sr = n
		SessionFactory sf= conf.buildSessionFactory();
		Session sesson = sf.openSession();
		Transaction t = sesson.beginTransaction();
		sesson.save(student);
		sesson.save(laptop);
		t.commit();
		
		System.out.println(student.toString());
		System.out.println(laptop.toString());
		
	}
}
