//Creating your own generic type class
public class MyGenericClass<T> {
	T obj;
	
	MyGenericClass(T obj){
		this.obj = obj;
	}
	
	public void displayObjectDetails(){
		System.out.println("The type of object: " +obj.getClass().getName());
	}
	
	public T getObject(){
		return obj;
	}
	
	/*
	 * Which List class would you use if your application does more reads than additions and deletion of objects? ArrayList
	 * Which method do you use to add an element to a Map? Put
	 * Which of the following can be used to know the number objects in a list or set? size()
	 * Set allows duplicates. False
	 * Which of the following should be used to sort elements? TreeSet
	 * Generics can be applied at a method level. True
	 */
}
