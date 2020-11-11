
public class StringMethods {
//STRING METHODS
	public static void main(String[] args) {
		String s = "Hello World";
		System.out.println("Length of the String: "+ s.length());
		//index of particular character in string
		//index starts at 0
		System.out.println("Index of o : "+s.indexOf("o"));
		
		System.out.println(s.charAt(4));
		//from 2 to ending
		System.out.println(s.substring(2)); //llo
		//from 0 to 2-1
		System.out.println(s.substring(0,2)); //He
		
		String[] result = s.split(" ");
		for (int i = 0; i<result.length; i++){
			System.out.println(result[i]);
		}
		//replaces chars
		System.out.println(s.replace('l', 'k'));
		
		System.out.println(s.toUpperCase());
		
		System.out.println(s.toLowerCase());
	}

}
