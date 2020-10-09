package flowcontrol;

public class DoWhile {

	public static void main(String[] args) {
	//	do{
	//		System.out.println("lol");
	//	}while(true);
	// unreachable code because of infinite loop
		//	System.out.println("After do while");
		int x = 1;
		do{
			if(x%2==0){
				System.out.println(x);
			}
			x++;
		}while(x<=30);
	}

}
