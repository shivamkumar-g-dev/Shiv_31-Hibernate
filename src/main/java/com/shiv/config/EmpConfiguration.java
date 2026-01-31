package com.shiv.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
//import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Environment;

public class EmpConfiguration {
public static SessionFactory getSessionFactory() {
		
		Properties properties = new Properties();
		
		properties.put(Environment.DIALECT,"org.hibernate.dialect.MySQLDialect");
		properties.put(AvailableSettings.JAKARTA_JDBC_DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.JAKARTA_JDBC_URL,"jdbc:mysql://localhost:3306/hibernate");
		properties.put(Environment.JAKARTA_JDBC_USER,"root");
		properties.put(Environment.JAKARTA_JDBC_PASSWORD,"Shivam@12");
		properties.put(Environment.HBM2DDL_AUTO,"create");
		properties.put(Environment.SHOW_SQL,"true");
		properties.put(Environment.FORMAT_SQL,"true");

//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().applySettings(properties).build();
//		Metadata metaData = new MetadataSources(ssr).addAnnotatedClass(shiv_31.Employee.class).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metaData.buildSessionFactory();
		

		

		return new MetadataSources(new StandardServiceRegistryBuilder().applySettings(properties).build())
				.addAnnotatedClasses(shiv_31.Employee.class,shiv_31.Address.class)
				.getMetadataBuilder().build().buildSessionFactory();
		
		
		
		
	}

}
