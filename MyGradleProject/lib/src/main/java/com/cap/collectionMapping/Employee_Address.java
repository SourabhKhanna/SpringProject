package com.cap.collectionMapping;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Employee_Address {
public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Address a1 = new Address();
		a1.setCity("hyd");
		a1.setState("tel");
		a1.setCountry("india");
		
		Address a2 = new Address();
		a2.setCity("bang");
		a2.setState("kar");
		a2.setCountry("india");
		
		Employee e1 = new Employee();
		e1.setEmpid(100);
		e1.setEmpname("yash");
		e1.getAddress().add(a1);
		
		Employee e2 = new Employee();
		e2.setEmpid(101);
		e2.setEmpname("bindhu");
		e2.getAddress().add(a2);
		
		
		em.persist(e1);
		em.persist(e2);
		
		
		
		
		em.getTransaction().commit();
		
		emf.close();
		em.close();
		
	}
}
