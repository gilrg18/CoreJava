package flowcontrol;

public class For {

	public static void main(String[] args) {
		int i = 1;
		/*for(; ;){
			System.out.println(i);
		}*/
		//unreachable code because of infinite for loop
		//System.out.println("hi");
		for(System.out.println("initializing loop"); i<10;i++){
			System.out.print(i+", ");
		}
	}

}
