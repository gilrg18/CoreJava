package com.gil.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//CONVER STRING TO LOWER CASE USING STREAMS
public class UpperToLowerCase {
	public static void main(String[] args) {
		List<String> l1 = new ArrayList<>();
		l1.add("GILBERTO");
		l1.add("LALA");
		l1.add("HECTOR");
		System.out.println(l1);
		/*
		 * So the l1.stream() gives the stream of the underlying collection.
		 * Then and we are using the map method
		 * 
		 * that can convert each element in the underlying collection, given
		 * function to it.
		 * 
		 * We are passing in a function as a lambda expression. Given a string,
		 * 
		 * we are converting that string to a lowercase by invoking the
		 * string.toLowerCase() method. .collect()
		 * 
		 * will take all the elements after the conversion and it will put
		 * inside a collection and that collection
		 * 
		 * we want is a list. That is the reason we are using
		 * Collectors.toList().
		 */
		List<String> l2 = l1.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
		System.out.println(l2);
	}
}
