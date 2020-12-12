package com.gil.java8.methodref.constructors;
//REFERENCING A CONSTRUCTOR
public class Test {
	public static void main(String[] args) {
		//lambda expression that is returning an instance of that class
		MyInterface f1 = s->new MyClass(s);
		f1.get("Using Lambdas");
		
		//this will automacally map the constructor to the get Method
		//whatever argument is being passed to the get method must be the same as the constructors argument for it to work
		MyInterface f2 = MyClass::new;
		f2.get("Using Constructor Mapping");
	}
}
