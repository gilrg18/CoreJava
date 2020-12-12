package com.gil.java8.lambdas.parameters;
//Addition using lambdas
public class Test {
	public static void main(String[] args) {
		//if you dont put parenthesis in x+y it will show those numbers concatenated instead of adding them
		Sum s = (x,y)->System.out.println("Sum is: "+ (x+y));
		s.add(4, 32);
	}
}
