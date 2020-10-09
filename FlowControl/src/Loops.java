import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		 Scanner myObj = new Scanner(System.in);  
		 System.out.println("Enter Number");
		 int n = myObj.nextInt();
		for(int i = 0; i<=n; i++){
			if(i%10==0){
				continue;
			}
			if(i>100){
				break;
			}
			System.out.print(i+", ");
		}
		
		System.out.println();
		int x = 0;
		while(x<=n){
			if(x%10==0){
				x++;
				continue;
			}
			if(x>100){
				break;
			}
			System.out.print(x+", ");
			x++;
		}
		
		System.out.println();
		int y = 0;
		do{
			if(y%10==0){
				y++;
				continue;
			}
			if(y>100){
				break;
			}
			System.out.print(y+", ");
			y++;
		}while(y<=n);
	}

}
