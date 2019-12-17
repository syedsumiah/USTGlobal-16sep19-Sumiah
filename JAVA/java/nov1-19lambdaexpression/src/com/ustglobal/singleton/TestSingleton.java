package com.ustglobal.singleton;

public class TestSingleton {
	public static void main(String[] args) {
		String s = "hello";
		
		MySingleton ms = MySingleton.getDbConnection();
		ms.s = "hello";
		System.out.println("hashCode of ms :"+ms.hashCode());
		
		MySingleton mx = MySingleton.getDbConnection();
		mx.s = "Sumiya";
		System.out.println("hashCode of mx :"+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}

}
