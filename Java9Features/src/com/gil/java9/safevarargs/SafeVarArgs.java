package com.gil.java9.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgs {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("abc","xyz");
		List<String> l2 = Arrays.asList("nyc" ,"lon");
		SafeVarArgs sva = new SafeVarArgs();
		sva.myMethod(l,l2);
	}

	// VARIABLE ARGUMENTS
	//@safevarargs to avoid heap pollution 
	@SafeVarargs
	private void myMethod(List<String>... l) {// List<String>[]
		//Object[] objects = l;
		//objects[0] = Arrays.asList(1, 2); // adding int not valid
		String name = (String) l[0].get(0);
		System.out.println(name);
		/*
		 * So this problem here is called dirty heap pooling or heap pollution problem
		 * which is very rare only
		 * 
		 * when use list of arguments like this list of variable arguments are a
		 * collection of variable arguments. And if you do something like this which is
		 * very rare you will end up getting an exception
		 */
	}
}
