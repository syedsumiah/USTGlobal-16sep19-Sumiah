package com.ustglobal.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestD {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> h1 = new LinkedHashMap<String, Integer>();

		h1.put("bangalore", 560068);
		h1.put("hariyana", 134203);
		h1.put("patna", 880000);

		for (Map.Entry<String, Integer> m : h1.entrySet()) {
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is :" + key + "-----------" + "value " + value);
		}
	}

}
