package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kuku", 34578987);
		hm.put("mala", 890543);
		hm.put("sheela", 9876543);

		HashMap hm1 = new HashMap();
		hm1.put("deepu", 234566);
		hm1.put("riya", 678900);
		hm1.put("kriti", 876544);

		boolean hasKey = hm.containsKey("mala");
		System.out.println("Has Key :" + hasKey);

		boolean hasValue = hm.containsValue(543456);
		System.out.println("has value :" + hasValue);

		hm.putAll(hm1);
		System.out.println("=================");
		System.out.println("after put all :" + hm);

		System.out.println(hm.size());

		boolean isEmpty = hm.isEmpty();
		System.out.println("map is empty :" + isEmpty);

		hm.clear();
		System.out.println("after clear :" + hm);

	}

}
