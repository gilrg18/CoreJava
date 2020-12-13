package classloading;

//CLASS IS LOADED ONLY ONCE
public class MultipleObjects {
	public static void main(String[] args) {
		User u1 = new User();
		Class c1 = u1.getClass();

		User u2 = new User();
		Class c2 = u2.getClass();

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		// same objec
		System.out.println(c1 == c2);
		/*
		 * So no matter how many times we use a particular class in our
		 * application, the class itself is loaded
		 * 
		 * into memory only once and it'll be used to create our object
		 * instances.
		 */
		// DISPLAY THE CLASS LOADERS
		System.out.println(c1.getClassLoader());
		/*
		 * Run the method and it is null because classes like String are loaded
		 * by the Bootstrap class loader which
		 * 
		 * are under JRE's lib folder rt.jar. The Bootstrap class loader is
		 * implemented in native programming
		 * 
		 * languages like C or C++.
		 * 
		 * That is the reason we can't get the information of it and it displays
		 * 
		 * a null.
		 */
		System.out.println(String.class.getClassLoader());
	}
}
