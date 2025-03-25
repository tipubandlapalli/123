package org.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Alien alien = new Alien();
        alien.setAlien_name("anna");
        alien.setAid(3);
        alien.setTech("Spring");

        /*
        Configuration config = new Configuration();
        config.addAnnotatedClass(org.telusko.Alien.class);
        config.configure();
         */
        SessionFactory factory = new Configuration()
                                            .addAnnotatedClass(org.telusko.Alien.class)
                                            .configure()
                                            .buildSessionFactory();

        Session session = factory.openSession();

        Transaction transaction = session.beginTransaction();
        session.persist(alien);
        transaction.commit();
        session.close();
        factory.close();
    }
}