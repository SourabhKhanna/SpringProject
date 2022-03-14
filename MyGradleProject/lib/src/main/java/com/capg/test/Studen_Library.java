package com.capg.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capg.entities.Library;
import com.capg.entities.Student;

public class Studen_Library {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Sourabh");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		
		
		 Student st1=new Student();  
         st1.setId(1);  
         st1.setName("Vipul"); 
         
         Student st2=new Student();  
         st2.setId(2);  
         st2.setName("Vimal");
         
         
         Student st3=new Student();  
         st3.setId(3);  
         st3.setName("Sourabh"); 
         
         em.persist(st1);
         em.persist(st2);
         em.persist(st3);
         
         
         Library lib1=new Library();  
         lib1.setB_id(101);  
         lib1.setB_name("Data Structure");  
         lib1.setStud(st1); 
         
         Library lib2=new Library();  
         lib2.setB_id(102);  
         lib2.setB_name("Data Base");  
         lib2.setStud(st2); 
         
         Library lib3=new Library();  
         lib3.setB_id(103);  
         lib3.setB_name("Java");  
         lib3.setStud(st3); 
//		
         
		em.persist(lib1);
		em.persist(lib2);
		em.persist(lib3);
		
		
		em.getTransaction().commit();
		emf.close();
		em.close();
	}

}
