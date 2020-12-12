package com.gil.java8.lambdas.interfaces;

public class Test {
	public static void main(String[] args) {
		// interface r = new class that implements that interface
		// Runnable r = new MyRunnableImpl();
		// Thread t = new Thread(r);
		// t.start();

		// Using lambdas
		// Multiple statements within a lambda, use {}
		/*
		 * So that's the power of lambdas.
		 * 
		 * No need to implement a class of its own (MyRunnableImpl) and then define the method (run method)
		 * and all that.
		 */
		Runnable r = () -> {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i+".Child Lambda Thread");
			}
		};
		//Thread receives a runnable object
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ".Main Thread");
		}
	}
}
