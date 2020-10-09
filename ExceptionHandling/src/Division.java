import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		int a,b,c;
		try{
			System.out.println("Enter two integers:");
			Scanner obj = new Scanner(System.in);
			a = obj.nextInt();
			b = obj.nextInt();
			c = a/b;
			obj.close();
			System.out.println("Result: "+c);
			//You can also have RuntimeException e because
			//ArithmeticException is a child of RuntimeException
		}catch(ArithmeticException e){
			System.out.println("Division by 0 is not valid!");
		}finally{
			System.out.println("Finally");
		}
		System.out.println("More code Can go here");
	}
}
