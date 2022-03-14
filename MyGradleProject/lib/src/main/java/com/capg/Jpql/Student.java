package com.capg.Jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Student {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sourabh2");
	EntityManager em = emf.createEntityManager();
	em.getTransaction().begin();
	
	
    Query q = em.createQuery("select s.name from Student s");
	
	@SuppressWarnings("unchecked")
	List<String> list = q.getResultList();
	
	System.out.println("Student name:");
	for(String s:list)
	{
		System.out.println(s);
	}
	
	em.getTransaction().commit();
	emf.close();
	em.close();
}
}
