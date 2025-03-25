package org.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {
        // First Fetch and then delete
        SessionFactory factory = new Configuration().addAnnotatedClass(org.telusko.Alien.class).configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();

        Alien a1 = session.find(org.telusko.Alien.class,1);
        Transaction transaction = session.beginTransaction();

        session.remove(a1);

        transaction.commit();
        session.close();
    }
}
