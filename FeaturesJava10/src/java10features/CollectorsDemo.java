package java10features;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
	
	
	public static void main(String[] args) {
		List<Integer> list = List.of(15,20,17,30);
		//Collectors to create a unmodifiable list, can be used with maps and sets too
		List<Integer> newList = list.stream().filter(i->i%3==0).collect(Collectors.toUnmodifiableList());
		//java.lang.unsopportedoperation exception because it is unmodifiable
		newList.add(40);
		
		
		//JAVA 10 GARBAGE COLLECTOR
		//JAVA 10 DEPRECATIONS
	}
}
