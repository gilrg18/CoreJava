package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
 public static void main(String[] args) {
	Map<Integer, String> map = new HashMap<>();
	//same content, different object (memory allocation)
	Integer id1 = new Integer(10);
	Integer id2 = new Integer(10);
	Map<Integer, String> iMap = new IdentityHashMap<>();
	
	map.put(id1, "Gil");
	//Lala will override gil because id keys are the same and hashmap keys are unique
	map.put(id2, "Lala");
	
	
	//Identity Maps doesnt override ids because it uses the == comparator which compares memory location
	//different from hashmap that uses equals comparator that compares contents
	iMap.put(id1, "Gil");
	iMap.put(id2, "Lala");
	
	System.out.println(map);
	
	
	System.out.println("Identity Map: "+iMap);
}
}
