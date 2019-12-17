package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {

		TreeMap<String, Integer> h1 = new TreeMap<String, Integer>();

		h1.put("bangalore", 560068);
		h1.put("hariyana", 134203);
		h1.put("patna", 880000);
		// h1.put(null,567890); NullPointerException

		for (Map.Entry<String, Integer> m : h1.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is :" + key);
			System.out.println("value is :" + value);
			System.out.println("===================");
		}

	}

}
