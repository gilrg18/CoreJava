
public class PrimeOrNot {
	public static void main(String[] args) {
		int n = 17;
		boolean primeFlag = true;
		for(int i = 2; i<n; i++){
			if(n%i==0){
				primeFlag = false;
			}
		}
		if(primeFlag){
			System.out.println("Prime");
		}else{
			System.out.println("Not A Prime");
		}
		
	}
}
