//TOSTRING METHOD
public class Test {
	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.setFirstName("Gil");
		passenger.setLastName("Rogel");
		passenger.setId(123);
		// toString method without overriding:
		// getClass().getName()+"@"+Integer.toHexString(hashcode())
		Passenger passenger2 = new Passenger();
		passenger2.setFirstName("Gil");
		passenger2.setLastName("Rogel");
		passenger2.setId(123);

		System.out.println(passenger);
		System.out.println(passenger.hashCode());

		/*
		 * OVERRIDE THE EQUALS METHOD Regular equals method returns false ; As
		 * we have overrided the equals method, now it return true cause it
		 * compares its contents
		 */
		System.out.println(passenger.equals(passenger2));
	}
}
/*
 * The default implementation of equals method in the Object class compares the
 * object references
 * 
 * toString method from the Object class should be overridden to display
 * meaningful information when an object is used in a System.out.println
 * 
 * 
 * It is always a good practice that we override the hashCode method in our
 * classes and return
 * 
 * a unique value for each object.
 * 
 * If we do not override this method, the JVM by default uses the object's
 * address as a hashCode value.
 */

/*
 * The Java docs from Oracle define a hashCode contract which says that, for
 * given two objects if
 * 
 * the equals method returns true, then their hashCode value must be the same.
 * 
 * This is the main rule. To classify further,
 * 
 * they even say that if equal returns false, then the hashCode value may or may
 * not be the same. Thirdly,
 * 
 * if the hashCode is same, equals may or may not return true. But the number
 * one rule and the contract is
 * 
 * that if equal returns true then their hashCodes must also be the same.
 */
