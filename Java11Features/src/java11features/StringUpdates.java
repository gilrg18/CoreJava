package java11features;

import java.util.stream.Collectors;

public class StringUpdates {
	public static void main(String[] args) {
		String str = "         ";
		System.out.println(str.isBlank());
		
		str = "I\nam\ngil xd xd";
		System.out.println(str);
		
		//lines method will split a string that is separated with new line \n
		System.out.println(str.lines().collect(Collectors.toList()));
		
		//unicode blank space
		char c = '\u2000';
		str+=c;
		System.out.println(str.trim());
		System.out.println(str.strip());
		//removes spaces at the beginning
		System.out.println(str.stripLeading());
		
		//removes spaces at the end
		System.out.println(str.stripTrailing());
		
		//repeat any string
		System.out.println("-".repeat(100));
		
	}
	
			
}
