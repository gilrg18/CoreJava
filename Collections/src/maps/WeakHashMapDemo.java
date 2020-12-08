package maps;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
//CTRL SHIFT O, to remove unused imports
public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		Map<User, String> map = new HashMap<>();
		Map<User, String> map2 = new WeakHashMap<>();
		User u = new User();
		User u2 = new User();
		map.put(u,"Hash");
		map2.put(u2,"WeakHash");
		System.out.println("Hash "+map);
		System.out.println("Weak Hash " +map2);
		
		u = null;
		u2 = null;
		//When we use a hash map the gc doesnt happen because we are still using the object (User u) in the map
		//Different from weak hash map where gc does happen because the object (User u) is now null and if
		//theres no objects other than in the map, it will remove them from the map (since its a null object now it 
		//will remove it from the map(
		System.gc();
		Thread.sleep(3000);
		
		System.out.println("Hash "+map);
		System.out.println("Weak Hash " +map2);
	}
}
