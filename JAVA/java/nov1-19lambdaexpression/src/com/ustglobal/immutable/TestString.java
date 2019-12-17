package com.ustglobal.immutable;

public class TestString {
	public static void main(String[] args) {

		MyString ms = new MyString(12, "sumiya");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());
		System.out.println(ms);

		ms.changeContent(20, "roopa");
		System.out.println(ms.getName());
		System.out.println(ms.getRollno());

		System.out.println("==================");
		MyString ms1 = ms.changeContent(20, "roopa");
		System.out.println(ms1.getName());
		System.out.println(ms1.getRollno());
	}

}
