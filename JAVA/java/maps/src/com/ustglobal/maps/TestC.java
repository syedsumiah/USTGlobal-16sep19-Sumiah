package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {

		LinkedHashMap<String, Integer> h1 = new LinkedHashMap<String, Integer>();

		h1.put("bangalore", 560068);
		h1.put("hariyana", 134203);
		h1.put("patna", 880000);

		System.out.println(h1);

		Set<String> s = h1.keySet();
		for (String key : s) {
			System.out.println("key :" + key);
		}
		System.out.println("===============");

		Collection<Integer> c = h1.values();
		for (Integer value : c) {
			System.out.println("value :" + value);
			System.out.println("=================");
		}
	}
}
