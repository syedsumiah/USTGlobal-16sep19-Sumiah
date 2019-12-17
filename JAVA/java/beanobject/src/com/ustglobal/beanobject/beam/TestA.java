package com.ustglobal.beanobject.beam;

public class TestA {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(123);
		s1.setName("Sumiya");
		s1.setRollNo(456);

		Database db = new Database();
		db.receive(s1);

		System.out.println("++++++======");

		Employee e1 = new Employee();
		e1.setId(23);
		e1.setSalary(100000);
		e1.setDesignation("Software Engineer");
		e1.setDept(1);
		e1.setName("Syed Sumiah");

		db.save(e1);





	}
}
