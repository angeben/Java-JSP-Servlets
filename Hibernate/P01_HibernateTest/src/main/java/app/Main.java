package app;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import entity.Users;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Users.class)
								.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			// Create user
			Users user = new Users("Test", "User", "testuser00", "test@outlook.com");
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
			System.out.println("A new row has been added to the DB");
			
			/*
			// Read user
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 1);
			session.getTransaction().commit();
			System.out.println("user");
			
			
			//Update user
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 1);
			user.setEmail("newemail@gmail.com");
			session.getTransaction().commit();
			System.out.println("user");
			
			//Delete user
			Users user = new Users();
			session.beginTransaction();
			user = session.get(Users.class, 3);
			session.delete(user);
			session.getTransaction().commit();
			*/
			
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
