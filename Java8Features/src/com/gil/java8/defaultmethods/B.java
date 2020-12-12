package com.gil.java8.defaultmethods;
//DEFAULT METHODS IN INTERFACES
//NOT ALLOWED TO IMPLEMENT TWO INTERFACES WITH THE SAME DEFAULT METHOD WITHOUT
//PROVIDING AN OVERRIDEN IMPLEMENTATION OF THAT METHOD
public class B implements A , X{
	public void m1(){
		System.out.println("M1 inside B");
	}
	/*
	 * It should be public because by default in interfaces, the access level is
	 * public. So it should be public
	 * 
	 * as well in the implementation class.
	 *
	 */
//	public void m1() {
	//	System.out.println("m1 inside B");
//	}
}
