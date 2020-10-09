
public class ShortCircuitOperators {
	public static void main(String[] args) {
		boolean x = true, y = false;
		//DIFFERENCE BETWEEN USING 1 | OR & AND USING 2 || OR && IS THAT WHEN YOU USE || OR && 
		//AND THE FIRST VALUE IS TRUE FOR || IT WONT LOOK ON THE NEXT VALUE, THUS IMPROVING PERFORMANCE
		//FOR && IF THE FIRST VALUE IS FALSE, IT WONT LOOK ON THE NEXT VALUE, THUS IMPROVING PERFORMANCE
		//USING ONLY 1 | OR & EVALUATES BOTH OF THE ARGUMENTS
		// |,& Relative slow performance, applicable for both integral and boolean types
		// ||, && Faster, boolean only
		if(x||y){
			System.out.println("Inside If");
		}
	}
}
