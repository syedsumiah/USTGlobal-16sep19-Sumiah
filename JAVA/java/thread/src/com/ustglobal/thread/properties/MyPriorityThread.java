package com.ustglobal.thread.properties;

public class MyPriorityThread extends Thread{
	public static void main(String[] args) {
		
		System.out.println("Main Thraed");
		int p = Thread.currentThread().getPriority();
		System.out.println("main Thread Priority : "+p);
		Thread.currentThread().setPriority(7);
		System.out.println("main thread priority :"+Thread.currentThread().getPriority());
		
		MyPriorityThread t = new MyPriorityThread();
		int q =t.getPriority();
		System.out.println("mypriority thread priority :"+q);
		
		t.setPriority(6);
		System.out.println("MyPriority thread priority : "+t.getPriority());
		
		System.out.println("Main ended");
	
	}

}
