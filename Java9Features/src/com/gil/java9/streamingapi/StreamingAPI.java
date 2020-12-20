package com.gil.java9.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 40, 7, 18, 23, 30, null);

		// java 8
		// System.out.println(list.stream().filter(x -> x % 5 ==
		// 0).collect(Collectors.toList()));
		// java 9
		System.out.println(list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		/*
		 * Run it and you see the first filter works fine it goes through all the
		 * elements the filter method goes
		 * 
		 * through all the elements in the list then it filters them all based on this
		 * condition.
		 * 
		 * That is the reason you are seeing ten forty and thirty but the take while it
		 * will take the elements
		 * 
		 * as long as this predicate returns true.
		 * 
		 * But the first time it hits an element that does not match this predicate it
		 * will stop right there.
		 * 
		 * That's the reason you only see 10 and 40 as soon as it reaches 7.
		 * 
		 * It stops it doesn't go any further.
		 */
		// Opposite of takeWhile
		System.out.println(list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		/*
		 * So as long as this condition returns true it will not care about it.
		 * 
		 * So ten forty it ignores all of that and as soon as it hits seven when this
		 * condition becomes false it
		 * 
		 * will take the entire list or
		 * 
		 * Collection from that it will stream the rest of the elements or it will take
		 * the rest of the elements
		 * 
		 * that the reason you see 7 1823 and 30.
		 */

		System.out.println(list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
		/*
		 * can be used with flat map to avoid null values and null pointer
		 * 
		 * exceptions.
		 */
	}
}
