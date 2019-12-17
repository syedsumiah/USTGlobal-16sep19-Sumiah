package com.ustglobal.lambdaexpression;

public class TestMessage {
	public static void main(String[] args) {

		MessageInterface msg = (message) -> {
			System.out.println("hello");

			return message;
		};
		String m = msg.greet("sumiya");
		System.out.println(m);

	}

}
