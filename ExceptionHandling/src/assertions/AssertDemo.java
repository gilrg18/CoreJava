package assertions;

//Assertions are by default disabled
//Run configurations > arguments > vm arguments > -ea (to enable assertions)
public class AssertDemo {
	public static void main(String[] args) {
		
		int withdrawlAmount = 230;
		int currentBalance = 220;
		//Asserts are for unit testing
		assert(withdrawlAmount <= currentBalance):"Withdrawl Amount is more than current Balance";
		//will pop an assertion error because withdrawl amount is not lower
		//than currentbalance
		
	}
}
