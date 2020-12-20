package com.gil.java12.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {
	public static void main(String[] args) {
		// merging 2 streams with .teeing(downstream1, downstream2, merger)
		/*
		 * We are collecting all the elements into it here.
		 * 
		 * We have used collector dot teeing method that allows us to use two different
		 * down streams.
		 * 
		 * One of them is simply counting the number of elements in the stream.
		 * 
		 * The second downstream is filtering the elements in this stream based on a
		 * predicate which is numbers
		 * 
		 * greater than 10.
		 * 
		 * And the result of it will go into a list.
		 * 
		 * Finally using class Result as a merger
		 */
		Result result = Stream.of(5, 10, 15, 18, 59, 8, 20, 7).collect(Collectors.teeing(Collectors.counting(),
				Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()), 
				Result::new));

		System.out.println(result);
	}
}
