import javax.xml.stream.events.StartDocument;

public class MacBookPro extends MACBook {
	@Override
	public void start(){
		System.out.println("Inside MacBookPros Start");
	}
	@Override
	public void shutdown(){
		System.out.println("Inside MacBookPros Shutdown");
	}
	
	public void prosMethod(){
		System.out.println("Inside MacBookPros prosMethod");
	}
}
