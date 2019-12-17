package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {

		Employee e1 = new Employee(1, "sumiya", 23000);
		Employee e2 = new Employee(2, "asma", 20000);
		Employee e3 = new Employee(3, "akbar", 53000);
		Employee e4 = new Employee(4, "bushra", 73000);
		Employee e5 = new Employee(5, "rahman", 29000);
		Employee e6 = new Employee(6, "badroonnisa", 20000);
		Employee e7 = new Employee(7, "sabiha", 63000);
		Employee e8 = new Employee(8, "raheem", 13000);
		Employee e9 = new Employee(9, "umapriya", 53000);

		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		ArrayList<Employee> a2 = new ArrayList<Employee>();
		a2.add(e4);
		a2.add(e5);
		a2.add(e6);

		ArrayList<Employee> a3 = new ArrayList<Employee>();
		a3.add(e7);
		a3.add(e8);
		a3.add(e9);

		HashMap<String, ArrayList<Employee>> m = new HashMap();
		m.put("1st", a1);
		m.put("2nd", a2);
		m.put("3rd", a3);

		ArrayList<Employee> first = m.get("1st");
		Iterator<Employee> it = first.iterator();
		while (it.hasNext()) {
			Employee s = it.next();
			System.out.println("Id is :" + s.id);
			System.out.println("Name is :" + s.name);
			System.out.println("salary is :" + s.salary);
		}

	}

}
