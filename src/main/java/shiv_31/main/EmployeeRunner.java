package shiv_31.main;


//import java.util.List;

//import org.hibernate.SessionFactory;
import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.Metadata;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.query.MutationQuery;
//import org.hibernate.query.Query;

import com.shiv.config.EmpConfiguration;

import shiv_31.Address;
import shiv_31.Employee;

public class EmployeeRunner {



//	public static void delById(int id, Session session) {
//	HQL delete query
//		MutationQuery query = session.createMutationQuery("delete from empp where id = :id");
//		query.setParameter("id", id);
//		query.executeUpdate();
//	}
	
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Ram");
		emp1.setGender("M");
		emp1.setSalary(570000);
		
		
		Address add1 = new Address();
		add1.setCity("Noida");
		add1.setState("UP");
		add1.setEmployee(emp1);
		
		emp1.setAddress(add1);
		
		Employee emp2 = new Employee();
		emp2.setName("Niyati");
		emp2.setGender("F");
		emp2.setSalary(100000);
		
		
		Address add2 = new Address();
		add2.setCity("Indirapuram");
		add2.setState("UP");  
		add2.setEmployee(emp2);
		
		emp2.setAddress(add2);
		
		
		Session session = EmpConfiguration.getSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.persist(add1);
		session.persist(emp1);
		session.persist(add2);
		session.persist(emp2);
		tx.commit(); 
		
		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Address address = session.find(Address.class, 1);
		System.out.println(address);
		System.out.println(address.getEmployee());
		
		
		Employee employee2 = session.find(Employee.class, 2);
		System.out.println(employee2);
		System.out.println(employee2.getAddress());
		
		Address address2 = session.find(Address.class, 2);
		System.out.println(address2);
		System.out.println(address2.getEmployee());
		
		

//		Employee emp1 = new Employee("Avya", "FeMale", 64548);
//		Address add1 = new Address("Noida","UP");
		
//		emp1.setAddress(add1);
				
//		Employee emp2 = new Employee("Nitin", "FeMale", 64548, "IND");
//		Employee emp3 = new Employee("Neelam", "FeMale", 64548, "IND");
//		Employee emp4 = new Employee("Jack", "Male", 64548, "IND");
//		Employee emp5 = new Employee("Atharv", "Male", 64548, "IND");
//		Employee emp6 = new Employee("Naitik", "Male", 64548, "IND");
//		Employee emp7 = new Employee("Preetam", "Male",38983,"IND");
		
		
		

		
		
//		MutationQuery namedQuery = session.createNamedMutationQuery("updateAnEmployee");
//		namedQuery.setParameter("n", "Shreya");
//		namedQuery.setParameter("i", 10);
//		namedQuery.executeUpdate();q
		
//		
//		MutationQuery namedQuery = session.createNamedMutationQuery("deleteEmployeeById");
//		namedQuery.setParameter("i", 10);
//		namedQuery.executeUpdate();
//		
		
		
		
		
		
		
//		session.persist(emp1);
//		session.persist(emp2);
//		session.persist(emp3);
//		session.persist(emp4);
//		session.persist(emp5);
//		session.persist(emp6);
//		session.persist(emp7);
		
		
//		Query <Employee>query=session.createQuery("from empp",Employee.class);
//		List list=query.list(); 
//		System.out.println(list);
		

//		Example of HQL to get all the records
//		Query query1=session.createQuery("from empp",Employee.class);
//		List list=query1.list();  
//		System.out.println(list);
//		
//		HQL to get records with pagination
//		query1.setFirstResult(2);
//		query1.setMaxResults(5);
//		System.out.println(query1.list());

//		Query q=session.createQuery("select max(name) from empp");  
//		List list1=q.list();  
//		System.out.println(list1);  

//		HQL update query Using Named Parameters
//		MutationQuery mutationQuery = session.createMutationQuery("update empp set name=:n where id=:i");  
//		mutationQuery.setParameter("n","Pankaj");  
//		mutationQuery.setParameter("i",4);  
//		System.out.println("status: "+mutationQuery.executeUpdate());  

//		HQL delete query
//		MutationQuery query=session.createMutationQuery("delete from empp where id = 17");  
//		query.executeUpdate();  
//		
//		Query query11=session.createQuery("from empp",Employee.class);
//		List list1=query11.list();  
//		System.out.println(list1);

		
		
		
//		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
//		SessionFactory sessionFactory = cfg.buildSessionFactory();
//		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sessionFactory = metadata.buildSessionFactory();
		
		
//		Metadata metadata = new MetadataSources(new StandardServiceRegistryBuilder() ).getMetadataBuilder().build();
		
		
//		SessionFactory sessionFactory = new MetadataSources(new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build()).getMetadataBuilder().build().buildSessionFactory();
		
		
//		session.persist(add1);
//		session.persist(emp1);
//		tx.commit();
		
//		Query query1 = session.createQuery("from empp", Employee.class);
//		List list = query1.list();
//		System.out.println(list);
		
		
//		session.close();
		
		
//		Employee employee = session.find(Employee.class,19);
//		System.out.println(employee);
		
		
	}

}
