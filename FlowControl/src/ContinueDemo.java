
public class ContinueDemo {
	//CONTINUE WILL SKIP THE CURRENT ITERATION IN A LOOP
	public static void main(String[] args) {
		//PRINT ODD NUMBERS
		for(int i = 0; i<10; i++){
			if(i%2==0){ //IF ITS AN EVEN NUMBER, SKIP THE ITERATION
				continue;
			}
			System.out.println(i);
		}
	}
}
