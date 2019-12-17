package com.ustglobal.beanobject.beam;

import java.util.Scanner;

public class TestB {

	public static void main(String[] args) {
		System.out.println("Scanner class");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter age");
		int age = sc.nextInt();
		System.out.println("age is "+age);

		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("name is "+name);

		System.out.println("enter name112");
		String name1 = sc.nextLine();
		System.out.println("your name is "+name1);

	}

}
