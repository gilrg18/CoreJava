package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.SBComparator;
//TREESET OF STRINGBUFFER
public class StringBufferTreeSet {
	public static void main(String[] args) {
		//USING THE COMPARATOR TO AVOID CLASS CAST EXCEPTION
		Set<StringBuffer> set = new TreeSet<>(new SBComparator());
		
		set.add(new StringBuffer("abcd"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		set.add(new StringBuffer("mno"));
		
		for(StringBuffer obj : set){
			System.out.println(obj);
		}
		
		String x = "abc";
		String y = "def";
		System.out.println(x.compareTo(y));
		System.out.println(y.compareTo(x));
		System.out.println(x.compareTo("abc"));
	}
	/*
	 * CompareTo
	 * compare(obj1,obj2)
	 * negative value if obj1 has to come before obj2
	 * positive value if obj has to come after obj2
	 * 0 if both obj1 and obj2 are same
	 */
	
	/* Class cast exception
	 * java.lang.StringBuffer cannot be cast to java.lang.Comparable. 
	 * Any class that we need to add to a TreeSet should either provide an implementation of a Comparator or 
	 * the class itself should implement the Comparable interface.
	 * 
	 * Create SBComparator Class (string buffer comparator) to implement comparator interface
	 */
}
