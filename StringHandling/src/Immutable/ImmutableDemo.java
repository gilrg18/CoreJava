package Immutable;
//Immutability in Action
public class ImmutableDemo {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		System.out.println("Before Concat"+"\ns1: "+s1+"\ns2: "+s2);
		s1.concat(s2);
		/*
		 * You see that the s1 and s2 values remain the same even after concatenation.
         * So s1 and s2 are immutable.
		 */
		System.out.println("After Concat"+"\ns1: "+s1+"\ns2: "+s2);
		s2 = s1.concat(s2);
		System.out.println("After Assigning Concat"+"\ns1: "+s1+"\ns2: "+s2);
	}

}
