 package com.ustglobal.jpawithhibernateapp.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicInsertDemo {
	public static void main(String[] args) {
		
		EntityManager entityManager = null;
		EntityTransaction entityTransaction = null;
		try {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		 entityManager = entityManagerFactory.createEntityManager();
		 entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		String jpql = "insert into Product(pid,pname,quantity) values(:id, :name, :qua)";
		Query query = entityManager.createNativeQuery(jpql);
		
		// in dynamic we will using setParameter
		query.setParameter("name", "pencil");
		query.setParameter("id", 30);
		query.setParameter("qua", 45);
		
		int result = query.executeUpdate();
		System.out.println(result);
		System.out.println("inserted");
		entityTransaction.commit();
		}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
		}finally {
		entityManager.close();
		}


	}

}
