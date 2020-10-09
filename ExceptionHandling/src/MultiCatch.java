
public class MultiCatch {
//You can have as many catches as you want 
	public static void main(String[] args) {
		try{
		String input = args[0];
		System.out.println("Input is: " +input);
		int output = Integer.parseInt(input);
		System.out.println("Output is: "+ output);
		//If you put RuntimeException here it will catch both exceptions 
		//therefore showing an error on second catch
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Input is required");
		}catch(NumberFormatException e){
			//Exceptions can be called the same "e" because
			//each catch block has its own scope and the variables
			//are local to each catch block
			System.out.println("Invalid Input provided");
		}finally{
			System.out.println("Hi");
		}
		System.out.println("blalalal");
	}

}
