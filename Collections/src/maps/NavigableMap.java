package maps;

import java.util.TreeMap;

//map <-sorted map <-navigable map <- tree map
public class NavigableMap {
	public static void main(String[] args) {
		TreeMap<String, String> tm = new TreeMap<>();
		tm.put("D", "d");
		tm.put("E", "e");
		tm.put("A", "a");
		tm.put("B", "b");
		tm.put("C", "c");
		
		
		System.out.println(tm);
		//highest value, lower or equal than a
		System.out.println(tm.floorKey("A"));
		//highest value, lower than a
		System.out.println(tm.lowerKey("B"));
		//lowest value, higher or equal than a
		System.out.println(tm.ceilingKey("B"));
		//lowest value, higher than a
		System.out.println(tm.higherKey("A"));
		//removes first value
		System.out.println(tm.pollFirstEntry());
		//removes last value
		System.out.println(tm.pollLastEntry());
		//orders map in descending order
		System.out.println(tm.descendingMap());
		//orders keys in descending order
		System.out.println(tm.descendingKeySet());
		System.out.println(tm);
	}
}
