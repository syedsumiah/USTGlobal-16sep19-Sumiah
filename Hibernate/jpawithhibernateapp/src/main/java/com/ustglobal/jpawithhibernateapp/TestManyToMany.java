package com.ustglobal.jpawithhibernateapp;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytomany.Course;
import com.ustglobal.jpawithhibernateapp.manytomany.Student;

public class TestManyToMany {
	public static void main(String[] args) {
		
		Course c1 = new Course();
		c1.setCid(4);
		c1.setCname("java");
		
		Course c2 = new Course();
		c2.setCid(5);
		c2.setCname("SQL");
		
		ArrayList<Course> alCourse = new ArrayList<Course>();
		alCourse.add(c1);
		alCourse.add(c2);
		
		Student s1 = new Student();
		s1.setSid(97);
		s1.setEname("sumiya");
		s1.setCourse(alCourse);
		
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction  = entityManager.getTransaction();
			entityTransaction.begin();
			System.out.println("Record Saved");
			entityManager.persist(s1);
			entityTransaction.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		

	}

}
