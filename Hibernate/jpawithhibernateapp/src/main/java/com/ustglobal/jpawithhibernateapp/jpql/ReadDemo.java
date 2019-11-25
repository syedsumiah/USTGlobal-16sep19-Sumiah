package com.ustglobal.jpawithhibernateapp.jpql;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		/*
		 * String jpql = "from Product"; Query query = entityManager.createQuery(jpql);
		 * //query.getResultList(); List<Product> product = query.getResultList();
		 * for(Product products : product) { System.out.println(product.getPid());
		 * System.out.println(product.getPname());
		 * System.out.println(product.getQuantity()); }
		 */		
		
		System.out.println("==========================");
		String jpql = "select pname from Product";
		Query query = entityManager.createQuery(jpql);
		List<String> product = query.getResultList();
		for(String Pname : product) {
			System.out.println("Name----"+Pname);
		}
		entityManager.close();
	}
	
	

}
