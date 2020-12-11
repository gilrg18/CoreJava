//Creating your own generic type class
public class Test {

	public static void main(String[] args) {
		MyGenericClass<String> s = new MyGenericClass<>("Gilbert");
		s.displayObjectDetails();
		System.out.println(s.getObject());

		MyGenericClass<Integer> s1 = new MyGenericClass<>(123);
		s1.displayObjectDetails();
		System.out.println(s1.getObject());

		MyGenericClass<Double> s2 = new MyGenericClass<>(123.4343);
		s2.displayObjectDetails();
		System.out.println(s2.getObject());
		/*
		 * Generics in Java are compile time generics and not runtime generics.
		 * This is because of a concept called Type
		 * 
		 * Erasure. Meaning, the compiler will use the type we specify on a
		 * generic instance to make sure that the
		 * 
		 * right type of data is being added to that particular class. And once
		 * it is done with its checks, it will
		 * 
		 * remove this type. The compiler at the end of its compilation phase
		 * will remove that type once it ensures
		 * 
		 * that the right data is being added.
		 * 
		 * This is called Type Erasure.
		 * 
		 * example:
		 * Compile time: ArrayList<String>
		 * Run time: ArrayList<> (ALREADY KNOWS IT MUST BE STRINGS ONLY)
		 */
	}

}
