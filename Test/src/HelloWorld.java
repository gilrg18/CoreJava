
public class HelloWorld {
	
	public static int BinarySearch(int[] arr,int numberToSearch){
		int left = 0;
		int right = arr.length -1;
		
		while(left<=right){
			int middle = (left+right)/2;
			if(numberToSearch == arr[middle]){
				return middle;
			}
			if(numberToSearch<arr[middle]){
				right = middle-1;
			}else{
				left = middle+1;
			}
					
		}
		return -1;
	}
	
	public static void main(String[] args){
		System.out.println("FUCK");
		int[] array = {0,1,2,3,4,5};
		System.out.println(BinarySearch(array,-1));
		System.out.println(BinarySearch(array,0));
		System.out.println(BinarySearch(array,1));
		System.out.println(BinarySearch(array,2));
		System.out.println(BinarySearch(array,3));
		System.out.println(BinarySearch(array,4));
		System.out.println(BinarySearch(array,5));
		System.out.println(BinarySearch(array,6));
	}
}
