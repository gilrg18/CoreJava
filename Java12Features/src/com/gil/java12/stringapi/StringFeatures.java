package com.gil.java12.stringapi;
public class StringFeatures {

	public static void main(String[] args) {
		String s= "asdasd asd asd asd asd sd s ds ds ds";
		System.out.println(s);
		
		System.out.println("After indentation: "+s.indent(5));
		System.out.println("After indentation: "+s.indent(-3));
		
		String s1 = "10";
		System.out.println(s1);
		Integer transform = s1.transform(Integer::parseInt);
		System.out.println(transform);
	}
}
