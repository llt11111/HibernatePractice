package com.hibernate.hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersistenceLifeCycleTest {

	public static void main(String[] args) {
		
		
		
		Configuration conf = new Configuration().addAnnotatedClass(SimpleLaptop.class).configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sesson = sf.openSession();
		
		SimpleLaptop laptop = new SimpleLaptop();  // will  be in transient start until transaction not saved 
		
		laptop.setId(101);
		laptop.setBrand("Dell");
		sesson.beginTransaction();
		sesson.save(laptop);  // will move to persist start after save and commit 
		laptop.setBrand("lenovo");
		sesson.getTransaction().commit();  // will move to detach start after commit automatically .. 
		sesson.beginTransaction();
		laptop.setBrand("Lenovo");
//		sesson.save(laptop);// we don't need to call save now . transactoin begin andd commit will update in db
		
		
		sesson.getTransaction().commit();
	}
}
