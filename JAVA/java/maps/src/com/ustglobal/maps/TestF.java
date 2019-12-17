package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {

		Student s1 = new Student(2, "divya", 76.4);
		Student s2 = new Student(5, "Sumiya", 78.4);
		Student s3 = new Student(1, "bushra", 66.4);
		Student s4 = new Student(3, "uma", 56.7);
		Student s5 = new Student(4, "priya", 86.4);
		Student s6 = new Student(6, "lahari", 36.5);
		Student s7 = new Student(7, "roopa", 26.9);
		Student s8 = new Student(8, "asma", 46.6);
		Student s9 = new Student(9, "sania", 96.4);
		Student s10 = new Student(10, "karteena", 84.4);

		ArrayList<Student> a1 = new ArrayList<>();
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);

		ArrayList<Student> a12 = new ArrayList<Student>();
		a12.add(s4);
		a12.add(s5);
		a12.add(s6);

		ArrayList<Student> a13 = new ArrayList<Student>();
		a13.add(s7);
		a13.add(s8);
		a13.add(s9);
		a13.add(s10);

		HashMap<String, ArrayList<Student>> hm = new HashMap();
		hm.put("first", a1);
		hm.put("second", a12);
		hm.put("third", a13);

		ArrayList<Student> first = hm.get("second");
		Iterator<Student> it = first.iterator();
		while (it.hasNext()) {
			Student s = it.next();
			System.out.println("Id is :" + s.id);
			System.out.println("Name is :" + s.name);
			System.out.println("Percentage is :" + s.percentage);
			System.out.println("=================");
		}

	}

}
