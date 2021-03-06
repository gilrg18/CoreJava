package Immutable;
//String pooling in action
//String Comparison
public class StringPoolDemo {

	public static void main(String[] args) {
		User user1 = new User(1,"Gil");
		User user2 = new User(1,"Gil");
		System.out.println(user1);
		System.out.println(user2);
		String s1="abc";
		String s2="def";
		String s3="abc";
		String s4 = new String("abc");
		//.hashCode() to check memory location
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		//"abc" is now in the String pool and all variables "abc" point to that location in the pool
		
		//== tells if they are pointing to the same memory location in the String Pool
		System.out.println(s1==s3);
		//.equals() compares the contents of the string, not the memory location
		System.out.println(s1.equals(s3));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		//If you use a new operator to create a string the jvm will create a new memory location
		//therefore s1==s4 is false cause it isnt the same memory location
		System.out.println(s1==s4);
		//equals only compares the content so abc=abc? true
		System.out.println(s1.equals(s4));
		
		//OBJECT COMPARISON
		System.out.println(user1==user2);
		//Even if they have the same values, it return false
		//the equals method uses == inside it but for the String class
		//they have overriden the equals method 
		//So we as programmers have to override the equals method if we want 
		//to compare the contents of the object
		System.out.println(user1.equals(user2));
		
		//Performance is an advantage of string pooling
	}

}
