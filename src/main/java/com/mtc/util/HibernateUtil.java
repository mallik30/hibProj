package com.mtc.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.mtc.entity.Product;

public class HibernateUtil {

	final private static SessionFactory SESSION_FACTORY;
	
	static {
		
		Configuration configuration = new Configuration();
		
		//loads hibernate.cfg.xml
		configuration.configure();
		configuration.addAnnotatedClass(Product.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SESSION_FACTORY = configuration.buildSessionFactory(serviceRegistry);
		
		}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
