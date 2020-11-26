package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.StringComparator;
//TREESET OF STRINGS
public class StringTreeSet {
	public static void main(String[] args) {
		//Sort string by length (CREATE StringComparator Class that implements comparator interface)
		Set<String> set = new TreeSet(new StringComparator());
		
		set.add("abcxyz");
		set.add("xyzabcde");
		set.add("defzzzzzzzzzz");
		set.add("mno");
		
		for(String obj : set){
			System.out.println(obj);
		}
	}
}
