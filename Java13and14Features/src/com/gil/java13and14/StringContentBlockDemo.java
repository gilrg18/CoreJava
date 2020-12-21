package com.gil.java13and14;

public class StringContentBlockDemo {
	public static void main(String[] args) {
		
		//use \ at the end of each line to keep it on the same line
		String str = """
				{\
				 "name":"Gil",\
				 "sal":100\
				}\
				"""; 
				//"<html>\n" + "<body>\n" + "<b>hi</b>\n" + "</body>\n" + "</html>\n";
		System.out.println(str);

	}
}
