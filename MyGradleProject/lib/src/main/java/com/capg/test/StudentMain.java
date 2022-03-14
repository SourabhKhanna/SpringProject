package com.capg.test;
import javax.persistence.*;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.commons.math3.geometry.spherical.twod.S2Point;

import com.capg.entities.Employee_2;
import com.capg.entities.Student;
public class StudentMain {	
		public static void main(String[] args) {		
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("Sourabh");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
		Student s1 = em.find(Student.class,102);		
//		s1.setId(110);
//		s1.setName("one one zero");
//			
//		System.out.println("Before Update");
//		System.out.println(s1.getId());
//		System.out.println(s1.getName());
		em.remove(s1);
		
//		    s1.setName("lkjhgf");
//			System.out.println(s1.getId());
//			System.out.println(s1.getName());
//			Employee e1=new Employee();
//			e1.setId(110);
//			e1.setName("one zero 10");					
//			em.persist(s1);		
			em.getTransaction().commit();
			
			emf.close();
			em.close();
			
		}
}





