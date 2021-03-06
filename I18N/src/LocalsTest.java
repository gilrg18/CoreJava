import java.util.Locale;

public class LocalsTest {
	public static void main(String[] args) {
		Locale l = Locale.getDefault();
		System.out.println(l);
		System.out.println(l.getCountry()+" "+l.getLanguage());
		System.out.println(l.getDisplayCountry()+" "+l.getDisplayLanguage());
		
		Locale.setDefault(Locale.UK);
		System.out.println(Locale.getDefault().getDisplayCountry());
		
		String[] isoCountries = Locale.getISOCountries();
		System.out.println("Countries: ");
		for(String eachCountry: isoCountries){
			System.out.print(eachCountry+" ");
		}
		
		String[] languages = Locale.getISOLanguages();
		System.out.println();
		System.out.println("Languages: ");
		for(String language : languages){
			System.out.print(language+" ");
		}
		
		
	}
}
