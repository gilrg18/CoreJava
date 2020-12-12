package com.gil.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//USING STREAMS
public class FilterEvenNumbers {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			l1.add(i);
		}
		
		l1.add(11);
		l1.add(3);
		l1.add(1);

		System.out.println(l1);

		/*
		 * List<Integer> l2 = new ArrayList<>(); for(Integer i: l1){ if(i%2==0){
		 * l2.add(i); } }
		 */
		/*
		 * So in one single line we have done all this which we have commented
		 * out.
		 * 
		 * We got the stream on the collection and the first step is to
		 * configure a filter on it and we have passed
		 * 
		 * the lambda expression, for filtering out only the even numbers from
		 * the list, dot collect is the processing
		 * 
		 * step.
		 * 
		 * So we have two steps, configuring and then processing. In processing
		 * we are collecting all the output
		 * 
		 * from the filter into a list.
		 * 
		 * This Collectors is a utility class. It returns a Collector.
		 * 
		 * There are several types of Collectors if you see, toList, toMap,
		 * toConcurrentMap, toSet, etc;
		 * 
		 * In this case we need a list back.
		 */
		List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
		
		//OTHER METHODS ON THE STREAM
		long count = l1.stream().filter(i -> i % 2 == 0).count();
		System.out.println("Number of even numbers: "+ count);
		
		//comparator is a functional interface so we create a lambda to reverse the list
		//Comparator<Integer> comp = (i1,i2)->i2.compareTo(i1);
		Comparator<Integer> comp = (i1,i2)->i1.compareTo(i2);
		//we reverse the list by passing the comparator we created into the sorted method from streams
		//we will leave it sorted normally ascending in order to use min and max methods
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println("Sorted:"+l3);
		
		int max =l1.stream().max(comp).get();
		System.out.println("Max value:"+max);
		int min = l1.stream().min(comp).get();
		System.out.println("Min value: "+min);
		
		l1.stream().forEach(i->System.out.println("For each: "+i));
	}

}
