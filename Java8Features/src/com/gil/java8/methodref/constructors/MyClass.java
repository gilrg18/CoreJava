package com.gil.java8.methodref.constructors;
//REFERENCING A CONSTRUCTOR
public class MyClass {
	 private String s;
	 
	 MyClass(String s){
		 this.s = s;
		 System.out.println("Inside the constructor: "+s);
	 }
}
