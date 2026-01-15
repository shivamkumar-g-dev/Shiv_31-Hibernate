package shiv_31.main;


//import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import shiv_31.Employee;

public class EmployeeRunner {

	public static void main(String[] args)  {
		
		Employee emp = new Employee("riya", "Female",38983);
		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		
//		Metadata metadata = new MetadataSources(new StandardServiceRegistryBuilder() ).getMetadataBuilder().build();
		
		
		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
	
		session.persist(emp);
		tx.commit();
		
		
//		Employee employee = session.find(Employee.class,19);
//		System.out.println(employee);
		
		
	}

}
