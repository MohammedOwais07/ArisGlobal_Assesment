package mydemo.hibernate;

import org.hibernate.cfg.Configuration;
import mydemo.hibernate.entity.Users;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class App {
   public static void main(String[] args) {
	SessionFactory factory = new Configuration()
			                     .configure("hibernate.cfg.xml")
                                 .addAnnotatedClass(Users.class)
                                 .buildSessionFactory();
   Session session = factory.getCurrentSession();
   
   
   try {
   
	   Users user =new Users(3,"username","email");
	   session.beginTransaction();
	   session.save(user);
	   session.getTransaction().commit();
	   
	   System.out.println("Row added!");
	   
   }
   finally {
	   session.close();
	   factory.close();
   }
   
   }
}
