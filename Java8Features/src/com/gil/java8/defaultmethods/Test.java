package com.gil.java8.defaultmethods;

//DEFAULT METHODS IN INTERFACES
public class Test {
	public static void main(String[] args) {
		// Interface a = new class that implements that interface
		A a = new B();
		// It will print m1 inside B (RUNTIME POLYMORPHISM)
		a.m1();
	}

	/*
	 * So you can have a default method on the interfaces by using the default
	 * 
	 * keyword.
	 * 
	 * You are welcome to override it in our child classes or we can use the
	 * default implementation if you don't
	 * 
	 * want to override.
	 */
}
