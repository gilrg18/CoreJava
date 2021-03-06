package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {

	public static void main(String[] args) {
		// List is an interface that is implemented by both arraylist and linked
		// list
		// It is a good practice to use interfaces in the left side of the code.
		// This is runtime polymorphism
		List<Integer> list = new ArrayList<>();

		for (int i = 10; i <= 100; i = i + 10) {
			list.add(i);
		}
		System.out.println("List: "+ list);
		//Adds
		list.add(2, 100);
		
		System.out.println("List after insert: "+ list);
		//Replaces
		list.set(3, 200);
		
		System.out.println("List after replacement: "+ list);
		
		List<Integer> secondList = new ArrayList<>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println("Second List: "+secondList);
		//if we use the .addAll with one parameter it will
		//add the list at the end of the original list
		//Inserting a list inside another list
		list.addAll(4, secondList);
		System.out.println("First list after adding second List at index 4: " + list);
		//Contains method 
		if(list.contains(123)){
			System.out.println("Value found in list");
		}else{
			System.out.println("Value not found..");
		}
		//.size returns number of elements in list
		//.get returns the value in the given index
		for(int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}
		//removes the element in the given index
		list.remove(3);
		System.out.println("List after deletion "+ list);
	}

}
