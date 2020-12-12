package com.gil.java8.functions;

import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		//Function that returns length of string
		Function<String,Integer> f = s->s.length(); 
		System.out.println(f.apply("Gilberto"));
		System.out.println(f.apply("Lala"));
	}
}
