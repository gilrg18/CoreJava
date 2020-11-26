package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		//Restricting the ArrayList Type to Integer using <Integer>
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(20));
		list.add(10);//Autoboxing (automatically converting into wrapper types)
		list.add(30);
		//list.add("Hi");
		System.out.println(list);
		
		//ITERATOR
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println(list);
	}
}
