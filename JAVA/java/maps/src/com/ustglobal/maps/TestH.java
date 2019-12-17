package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(10, "ajay");
		ht.put(123, "vijay");
		ht.put(1110, "sonu");
		ht.put(99, "arshu");
		ht.put(1, "ssss");
		// ht.put(null,"aaaaA"); NullPointerException
		// ht.put(108,null); NullPointerException
		System.out.println("data :" + ht);
	}

}
