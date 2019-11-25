package com.ustglobal.jpawithhibernateapp2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernateapp2.dto.Employee;

public class ReadDemo {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Employee employeeDetail = entityManager.find(Employee.class, 1);
		System.out.println("Eid----"+employeeDetail.getEid());
		System.out.println("Ename-----"+employeeDetail.getEname());
		System.out.println("Salary----"+employeeDetail.getSalary());
		entityManager.close();
	}
}
