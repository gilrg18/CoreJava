
public class Test {
	/*
	 * you can refer to any of the constants inside the Enum using the
	 * 
	 * Enum name because they are all static. public static and final by
	 * default.
	 */
	public static void main(String[] args) {
		PaymentType pt = PaymentType.CREDITCARD;
		/*
		 * by default the toString method on a Enum is overridden to return the
		 * name of the constant.
		 * 
		 * Here the name of the constant is CREDITCARD.
		 */
		System.out.println(pt);
		
		//VALUES AND ORDINAL METHODS
		//values method from Enum class returns an array which has all the Enums
		PaymentType[] paymentTypes = PaymentType.values();
		for(PaymentType paymentType: paymentTypes){
			System.out.println(paymentType);
			//ordinal() position of a particular constant inside that Enum
			System.out.println(paymentType.ordinal());
			//DEFINING AND USING FIELDS
			System.out.println(paymentType.getFee());
		}
	}
}
