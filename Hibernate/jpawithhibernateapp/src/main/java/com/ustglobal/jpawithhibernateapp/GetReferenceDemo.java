package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class GetReferenceDemo {
	public static void main(String[] args) {
		
	
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//Product product = entityManager.getReference(Product.class, 10);
		Product product = entityManager.find(Product.class, 20);
		System.out.println(product.getPid());
		System.out.println(product.getPname());
		System.out.println(product.getQuantity());
		
	
		
	}

}
