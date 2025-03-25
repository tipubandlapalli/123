package org.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {
    // we can also use merge for create
    // but not recommended
    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setAid(1);
        a1.setAlien_name("My new Name");
        a1.setTech("Java");

        SessionFactory factory = new Configuration().addAnnotatedClass(org.telusko.Alien.class).configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(a1);

        transaction.commit();
        session.close();
        factory.close();
    }
}
