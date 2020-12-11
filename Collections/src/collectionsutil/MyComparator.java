package collectionsutil;

import java.util.Comparator;
//USING CUSTOM COMPARATOR
public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
		//reversing the natural order
		return arg1.compareTo(arg0);
	}

}
