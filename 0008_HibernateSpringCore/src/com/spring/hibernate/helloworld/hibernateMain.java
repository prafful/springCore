package com.spring.hibernate.helloworld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hibernateMain {

	static SessionFactory sf;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		hibernateMain hm = new hibernateMain();
		Integer id1 = hm.addFriend("Manoj", "Chennai", "manoj@gmail.com");
		System.out.println("Friend Added  with id: " + id1) ;
		

	}

	private Integer addFriend(String name, String address, String email) {
		// TODO Auto-generated method stub
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		friends f = new friends(name, address, email );
		Integer id= (Integer) s.save(f);
		tx.commit();
		s.close();
		
		return id;
	}

}
