package assignment;

public class Test {
	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill(123, "FakeName", "FakeStreet123");
		ElectricityBill eb2 = new ElectricityBill(123, "FakeName2", "FakeStreet123");
		System.out.println(eb);
		System.out.println(eb.hashCode() + "\n" + eb2.hashCode());
		System.out.println(eb.equals(eb2));
	}
}
