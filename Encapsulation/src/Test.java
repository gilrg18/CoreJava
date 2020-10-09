
public class Test {
	public static void main(String[] args) {
		Customer c = new Customer();
		c.setFirstName(null);
		c.setLastName("berto");
		c.setCreditCard("Mierdamex");
		System.out.println(c.getFirstName()+" "+c.getLastName()+" "+c.getCreditCard());
	}
}
