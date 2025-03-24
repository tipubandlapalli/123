package org.telusko;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ast.tree.expression.AliasedExpression;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Alien alien = new Alien();
        alien.setAlien_name("tipu");
        alien.setAid(13);
        alien.setTech("Java");

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