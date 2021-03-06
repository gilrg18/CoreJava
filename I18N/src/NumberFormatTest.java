import java.text.NumberFormat;
import java.util.Locale;
//NUMBER FORMAT 
public class NumberFormatTest {
	public static void main(String[] args) {
		Double d = 112312323123.323232;
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(d));
		//control fraction digitis (default is 3)
		nf.setMinimumFractionDigits(4);
		System.out.println(nf.format(d));
		
		//control integer digits
		nf.setMaximumIntegerDigits(4);
		System.out.println(nf.format(d));
		nf.setMinimumIntegerDigits(20);
		System.out.println(nf.format(d));
		
		long l = 1234567890;
		NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
		NumberFormat nfUK = NumberFormat.getInstance(Locale.UK);
		System.out.println("US Number format: "+ nfUS.format(l));
		System.out.println("UK Number format: "+ nfUK.format(l));
	}
}
