package maps;
//WEAK HASH MAP DEMO
public class User {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User";
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize Called");
	}
}
