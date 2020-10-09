package encapsulation.assignment;

public class Test {
	public static void main(String[] args) {
		Patient p = new Patient();
		p.setId(99);
		p.setName("Chris");
		p.setSsn("A1B2C3");
		System.out.println("Id: "+p.getId()+",Name: "+p.getName()+", SSN: "+ p.getSsn());
	}
}
