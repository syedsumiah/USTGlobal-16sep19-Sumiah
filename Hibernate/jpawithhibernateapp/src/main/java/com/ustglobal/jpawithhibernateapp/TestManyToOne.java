package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.manytoone.Pencil;
import com.ustglobal.jpawithhibernateapp.manytoone.PencilBox;

public class TestManyToOne {
	public static void main(String[] args) {
		
		PencilBox pb = new PencilBox();
		pb.setBid(1);
		pb.setBname("Apsara");
				
		Pencil p = new Pencil();
		p.setPid(22);
		p.setColor("black");
		p.setPencilBox(pb);
		
		Pencil p1 = new Pencil();
		p1.setPid(11);
		p1.setColor("red");
		p1.setPencilBox(pb);
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
			entityManager = entityManagerFactory.createEntityManager();
			 entityTransaction  = entityManager.getTransaction();
			entityTransaction.begin();
			
			entityManager.persist(p);
			entityManager.persist(p1);
			System.out.println("Record Saved");
			entityTransaction.commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
		
	}

}
