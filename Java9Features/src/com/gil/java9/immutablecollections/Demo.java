package com.gil.java9.immutablecollections;

import java.util.List;
import java.util.Set;
import java.util.*;
//collections that cannot be modified
public class Demo {

	public static void main(String[] args) {
		// cant add null value
		List<String> list = List.of("abc", "xyz", "123", null);
		// cant add values
				list.add("nyc");
		// cant add duplicates
		Set<String> set = Set.of("abc", "xyz");
		/*
		 * the key here
		 * 
		 * is you can use the collection dot methods and pass it any objects.
		 * 
		 * And once you add those object that list that collection cannot be modified
		 * your set immutable collection.
		 */
		Map<Integer, Boolean> map = Map.of(1, true, 2, false, 3, true);
		//Map.ofEntries
	
	}
}
