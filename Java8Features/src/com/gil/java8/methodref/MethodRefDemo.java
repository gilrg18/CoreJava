package com.gil.java8.methodref;

public class MethodRefDemo {
	// only the argument types must match
	public static void myMethod() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child Thread");
		}
	}

	public static void main(String[] args) {
		Runnable r = MethodRefDemo::myMethod;

		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i <= 10; i++) {
			System.out.println("Parent Thread");
		}
	}
	/*
	 * you have started by implementing a static method in your class.
	 * 
	 * You have then mapped that static method to a functional interfaces
	 * method, using the double colon
	 * 
	 * operator and the class name because it is static.
	 * 
	 * So instead of repeating the code everywhere we need this implementation,
	 * we can put it inside a method
	 * 
	 * and then reuse it across our application simply by using the double colon
	 * operator.
	 */
}
