package com.hibernate.hibdemo;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateCatchTest {
	public static void main(String[] args) {
		AlienCache alien = new AlienCache();
		alien.setId(101);
		alien.setName("lalith");
		alien.setSex("Male");

		Configuration conf = new Configuration().addAnnotatedClass(AlienCache.class).configure();
		SessionFactory sf = conf.buildSessionFactory();
		Session sesson = sf.openSession();
		sesson.beginTransaction();
		sesson.save(alien);   
		sesson.getTransaction().commit();
		System.out.println(alien.toString());
		/*AlienCache a = (AlienCache) sesson.get(AlienCache.class, 101);
		AlienCache b = (AlienCache) sesson.get(AlienCache.class, 101);

		System.out.println(a.toString());
		System.out.println(b.toString());

//		sesson.getTransaction().commit();

		Session sesson2 = sf.openSession();
		sesson2.beginTransaction();
		AlienCache a1 = (AlienCache) sesson.get(AlienCache.class, 101);
		System.out.println(a1.toString());
		sesson2.getTransaction().commit();

		sesson.beginTransaction();
		Query<AlienCache> query1 = sesson.createQuery("from AlienCache where id=101");

		query1.setCacheable(true);
		AlienCache ab = query1.uniqueResult();
		System.out.println(ab.toString());
		sesson.getTransaction().commit();
		sesson2.beginTransaction();
		Query<AlienCache> query2 = sesson2.createQuery("from AlienCache where id=101");
		query2.setCacheable(true);
		AlienCache ab2 = query2.uniqueResult();
		System.out.println(ab2.toString());
		sesson2.getTransaction().commit();
		sesson.beginTransaction();
		SQLQuery<Object []> sqlQuery = sesson.createSQLQuery("select id, name, sex from AlienCache ");
		List<Object []> list = (List<Object[]>)sqlQuery.list();
		for(Object [] ob : list){
			System.out.println(ob[0] + "  "+ ob[1] + "  :  "+ ob[2] );
		}
		sesson.getTransaction().commit();*/


	}
}
