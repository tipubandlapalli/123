package org.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {
    public static void main(String[] args) {
        System.out.println("Hello from Fetch");
        SessionFactory factory = new Configuration()
                .addAnnotatedClass(org.telusko.Alien.class)
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        Session session = factory.openSession();
        //Alien a1 = session.get(org.telusko.Alien.class,1);
        // depcreted
        Alien a1 = session.find(org.telusko.Alien.class,1);
        System.out.println(a1);
        session.close();
        factory.close();

        // There is a concept of Eager Fetching and Lazy Fetching if are not using data it won't fire query/fetch data
    }
}
