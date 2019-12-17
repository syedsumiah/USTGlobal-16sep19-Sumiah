package com.ustglobal.beanobject.beam;

public class Database {

	void receive(Student s) {

		System.out.println("Id is "+s.getId());
		System.out.println("Name is "+s.getName());
		System.out.println("Roll No is "+s.getRollNo());
		System.out.println("==========================");
	}

	void save(Employee e) {

		System.out.println("=======im database================== ");
		System.out.println(" Id is "+e.getId());
		System.out.println("Name is "+e.getName());
		System.out.println("salary is "+e.getSalary());
		System.out.println("designation is "+e.getDesignation());
		System.out.println("dept no is "+e.getDept());
	}
}
