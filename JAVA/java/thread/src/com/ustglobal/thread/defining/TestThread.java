package com.ustglobal.thread.defining;

public class TestThread {
	public static void main(String[] args) {

		System.out.println("main starts");

		MyThread t1 = new MyThread();
		/*
		 * don't call run() method, it behaves like a normal program all code will be
		 * executed inside main thread only
		 */
		// t1.run();
		t1.start();
		// t1.start(); IllegalThreadStateException
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}
		System.out.println("main ends");
	}

}
