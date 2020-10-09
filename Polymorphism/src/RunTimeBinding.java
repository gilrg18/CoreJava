
public class RunTimeBinding {

	public static void main(String[] args) {
		AppleLaptop m1 = new MacBookPro();
		m1.start();
		m1.shutdown();
		//m1.prosMethod(); DOESNT WORK CAUSE ITS APPLELAPTOP NOT MACBOOKPRO
		
		MacBookPro m3 = (MacBookPro) m1;
		m3.prosMethod(); //WORKDS BECAUSE ITS MACBOOKPRO

		AppleLaptop m2 = new MacBookAir();
		m2.start();
		m2.shutdown();
		
		MacBookAir m4 = (MacBookAir) m2;
		
		MACBook m5 = new MacBookPro();
		m5.start();
		m5.shutdown();
		
		//OBJECT CASTING
		MacBookPro m6 = (MacBookPro) m5;
		m6.start();
		m6.shutdown();
		
	}

}
