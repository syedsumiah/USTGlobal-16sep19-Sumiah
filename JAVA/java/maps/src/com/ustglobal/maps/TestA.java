package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {

		HashMap hm = new HashMap();
		hm.put("kuku", 34578987);
		hm.put("mala", 890543);
		hm.put("sheela", 9876543);
		hm.put(null, 8765);
		hm.put(null, 97654);

		System.out.println("Data :" + hm);
		hm.put("mala", 87654);
		System.out.println("After modify :" + hm);
		hm.put("dimple", 9876543);
		System.out.println("after dimple : " + hm);
		System.out.println("after null :" + hm);
		System.out.println("==============");
		System.out.println("after adding duplicate null :" + hm);

		System.out.println("==========");
		Object phoneNo = hm.get("sheela");
		System.out.println("value :" + phoneNo);

		System.out.println("=================");
		Object phoneNo1 = hm.get("sumiya");
		System.out.println("value1 :" + phoneNo1);
		System.out.println("=============");

		Object value = hm.remove("kuku");
		System.out.println("value :" + value);

		System.out.println("after remove : " + hm);
	}

}
