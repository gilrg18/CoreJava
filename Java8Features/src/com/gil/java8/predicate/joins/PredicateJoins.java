package com.gil.java8.predicate.joins;

import java.util.function.Predicate;

//PASSING PREDICATE TO A METHOD
public class PredicateJoins {
	public static void main(String[] args) {
		int[] x = {0,7,10,20,30,40,50,60,70,73};
		
		Predicate<Integer> p1 = i->i>10;
		//even number
		Predicate<Integer> p2 = i->i%2==0;
		System.out.println("Greater than 10:");
		method1(p1, x);
		//PREDICATE AND JOINS IN ACTION
		System.out.println("Even Numbers:");
		method1(p2,x);
		
		System.out.println("Not greater than 10:");
		method1(p1.negate(), x);
		
		System.out.println("Greater than 10 & Even: ");
		method1(p1.and(p2), x);
		
		System.out.println("Greather than 10 or Even:");
		method1(p1.or(p2), x);
	}
	
	static void method1(Predicate<Integer> p, int[] x){
		for(int value: x){
			if( p.test(value)){
				System.out.println(value);
			}
		}
	}
}
