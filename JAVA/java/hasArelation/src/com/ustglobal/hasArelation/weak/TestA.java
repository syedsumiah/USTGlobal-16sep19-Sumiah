package com.ustglobal.hasArelation.weak;

public class TestA {

	public static void main(String[] args) {

		Person p = new Person();
		System.out.println(p.name);
		p.sleep();
		p.eat();

		System.out.println("====== Has-A relationship========");
		p.m.write();
		System.out.println(p.m.color);
		System.out.println(p.m.size);
	}

}
