package com.gil.java8.lambdas.basics;
//CREATE YOUR FIRST LAMBDA
public class Test {
	public static void main(String[] args) {
		//interface a = new class that implements that interface
		A a = new C();
		a.myMethod();
		
		//LAMBDA EXPRESSION
		A a1 = ()->System.out.println("Inside myMethod Lambda");
		a1.myMethod();
	}
}
