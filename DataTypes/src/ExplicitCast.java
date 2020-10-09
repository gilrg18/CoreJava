
public class ExplicitCast {

	public static void main(String[] args) {
		int i = 100;
		//byte b = (byte)i;
		
		int x = 97;
		char ch = (char)x;
		System.out.println(ch);
		
		int y = 130
				;
		byte z = (byte)y;
		System.out.println(z);
		
		int m = 612;
		byte n = (byte)m; //byte = 256... 256x2 = 512 + 100 = 612 ... 100 in char is 'd'
		char o = (char)n;
		
		System.out.println(o);
		

	}

}
