
public class MultiLevelTest {
	public static void main(String[] args) {
		//One last but important note about inheritance is that all object functionality can be accessed by using
		//one single object reference.
		Child ch = new Child();
		Child c = new Child();
		c.f1(); //function of the parent class
		c.f2();//function of child class
		System.out.println(c.hashCode());
	}
}
