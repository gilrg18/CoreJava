package arraysutil;

import java.util.Arrays;
import java.util.List;

public class ArraySort {
	public static void main(String[] args) {
		int[] a = { 40, 15, 10, 7, 30 };
		System.out.println("Before Sort:");
		for (int eachElement : a) {
			System.out.println(eachElement);
		}
		Arrays.sort(a);
		System.out.println("After Sort:");
		for (int eachElement : a) {
			System.out.println(eachElement);
		}

		String[] s = { "V", "A", "Z", "P" };
		Arrays.sort(s);
		System.out.println("Sorted: ");
		for (String eachString : s) {
			System.out.println(eachString);
		}
		// Using arrays custom comparator will reverse it
		System.out.println("Custom comparator:");
		Arrays.sort(s, new MyComparator());
		for (String eachString : s) {
			System.out.println(eachString);
		}

		int result = Arrays.binarySearch(s, "Z", new MyComparator());
		System.out.println("Index of Z: " + result);
		
		//ARRAY TO LIST CONVERTION
		List<String> list = Arrays.asList(s);
		//this will update the list aswell
		s[1] = "Y";
		//we cannot use any operations that will change the size of the array
		list.add("O");
		
		System.out.println(list);
	}
}
