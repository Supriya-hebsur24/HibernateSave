package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
Student s1=new Student();
        s1.setSname("heer");
        s1.setRollNo(5);
        s1.setAge(90);

        Configuration cfg=new Configuration();
        cfg.addAnnotatedClass(org.example.Student.class);
        // just for testing (this i was conforming to see the table creation )
        cfg.addAnnotatedClass(org.example.Pen.class);
        cfg.configure();
        SessionFactory sf=cfg.buildSessionFactory();

        Session session=sf.openSession();

        Transaction transaction= session.beginTransaction();
        // this is deprecated
       // session.save(s1);

            session.persist(s1);

        transaction.commit();
        session.close();
        sf.close();
        System.out.println(s1);


    }
}