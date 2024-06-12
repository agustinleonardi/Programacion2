package org.example.connections;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try{
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        }catch (HibernateException ex){
            System.out.println("Error al crear SessionFactory " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    public static Session getSession(){ return sessionFactory.openSession(); }

}
