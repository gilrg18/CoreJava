package com.gil.java8.lambdas.basics;
//CREATE A FUNCTIONAL INTERFACE

@FunctionalInterface
public interface B extends A{
	void myMethod();
	//if you try to add more methods it wont compile
}
