package com.ustglobal.hasArelation;

public class TestB {
	public static void main(String[] args) {

		Music m = new Music();
		System.out.println(m.songs);
		m.listenningSong();
		m.c.start();
		System.out.println(m.c.color);
		System.out.println(m.c.price);
	}

}
