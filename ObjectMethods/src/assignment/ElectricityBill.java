package assignment;

public class ElectricityBill {
	int meterNo;
	String name;
	String address;

	ElectricityBill(int meterNo, String name, String address) {
		this.meterNo = meterNo;
		this.name = name;
		this.address = address;
	}

	public String toString() {
		return "Meter Number: " + this.meterNo + "\nName: " + this.name + "\nAddress: " + this.address;
	}

	@Override
	public boolean equals(Object obj) {
		ElectricityBill eb = (ElectricityBill) obj;
		if (eb.meterNo == this.meterNo)
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return this.meterNo;
	}
}
