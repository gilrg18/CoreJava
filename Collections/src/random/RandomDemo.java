package random;
import java.util.Random;
//Random class
public class RandomDemo {
	public static void main(String[] args) {
		Random obj = new Random();
		int x = obj.nextInt();
		System.out.println("X: "+x);
		
		//will generate a number in the range of the given value excluding the given value
		int y = obj.nextInt(0);
		System.out.println("Y: " +y);
	}
}
