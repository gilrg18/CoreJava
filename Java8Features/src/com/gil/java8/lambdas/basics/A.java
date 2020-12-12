package com.gil.java8.lambdas.basics;
//CREATE A FUNCTIONAL INFERFACE
@FunctionalInterface
public interface A {
	void myMethod();
	//more than one method is not possible with functional interfaces
	//void myMethod1();
	//functional interfaces allows us to use lambda expressions
}
