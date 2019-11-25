package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp.dto.Product;

public class ReadDemo {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Product productDetail = entityManager.find(Product.class, 1);// find is used to retrive the data
		System.out.println("ID----"+productDetail.getPid());
		System.out.println("NAME----"+ productDetail.getPname());
		System.out.println("Quantity----"+ productDetail.getQuantity());
		entityManager.close();
	}// end of the main()

}// end of class
