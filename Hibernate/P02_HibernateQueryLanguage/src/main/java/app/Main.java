package app;

import java.util.List;
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
			// Query with all the users from the table
			session.beginTransaction();
			List<Users> users = session.createQuery("from users").getResultList();
			for(Users tmp: users)
				System.out.print(tmp);
			
			// Example of where clause
			users = session.createQuery("from users where first_name = 'peter'").getResultList();
			for(Users tmp: users)
				System.out.print(tmp);
			
			// Update example
			session.createQuery("update users set email='newemail@gmail.com'"
					+ "where first_name='peter'");
			
		} finally {
			session.close();
			factory.close();
		}
	}

}
