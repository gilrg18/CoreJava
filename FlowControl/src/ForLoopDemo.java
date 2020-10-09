
public class ForLoopDemo {
	public static void main(String[] args) {
		//for- when we know the number of iterations ahead of time;
		
		for(int i = 1; i<=20; i++){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 20; i>=1; i--){
			System.out.print(i+" ");
		}
		System.out.println();
		//BREAK EXAMPLE
		for(int i = 1; i<=20;i++){
			System.out.print(i+" ");
			if(i == 10){ break;}
		}
	}
}
