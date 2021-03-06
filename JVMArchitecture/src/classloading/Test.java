package classloading;
import java.lang.reflect.Method;

/*	Dynamic class loading in action:s
 *  dynamically load a class into memory and also retrieve it's information
 *  such as method names. 
 */
public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("User");

		Method[] methods = c.getDeclaredMethods();

		for (Method method : methods) {
			//play with method. methods
			System.out.println(method.getName());
		}
		System.out.println("Number of methods in the user class: " + methods.length);
	}
}
