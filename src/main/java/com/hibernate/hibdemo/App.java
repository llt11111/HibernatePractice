package com.hibernate.hibdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	Alien a = new Alien();
    	a.setAid(101);
    	a.setAname("lalit");
    	a.setAmarks(60);
    	
    	Alien a1 = new Alien();
    	a1.setAid(102);
    	a1.setAname("lalith");
    	a1.setAmarks(90);
    	
    	Configuration con_create = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry reg = new ServiceRegistry
    	SessionFactory sf = con_create.buildSessionFactory();
    	Session sesson = sf.openSession();
    	Transaction t = sesson.beginTransaction();
    	sesson.save(a);
//    	sesson.update(a1);
    	t.commit();
    	/*Alien b = sesson.get(Alien.class, 101);
    	t.commit();
    	System.out.println(b.toString());*/
    	
    	
    	Configuration con_update = new Configuration().setProperty("hbm2ddl.auto", "update").configure().addAnnotatedClass(Alien.class);
    	SessionFactory sf_update = con_update.buildSessionFactory();
    	Session session_update = sf_update.openSession();
    	session_update.beginTransaction();
    	Alien b = session_update.get(Alien.class, 101);
    	session_update.getTransaction().commit();
//    	System.out.println(b.toString());
    	
    	
    }
}
