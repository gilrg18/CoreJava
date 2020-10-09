
public class ArrayIndexOOBDemo {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		try{
			for(int i = 0; i<= arr.length; i++){
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index beyond array length");
		}
		System.out.println("Wont reach this if exception is thrown");
	}
	
	void method1(){
		System.out.println("Method1");
	}
}
