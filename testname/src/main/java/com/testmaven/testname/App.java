package com.testmaven.testname;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg =new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory s=cfg.buildSessionFactory();
        student s1=new student();
        s1.setId(1);
        s1.setName("Mohammed");
        s1.setCity("Kollegal");
        Session se=s.openSession();
        Transaction t=se.beginTransaction();
        se.save(s1);
        t.commit();
        se.close();
    }
}
