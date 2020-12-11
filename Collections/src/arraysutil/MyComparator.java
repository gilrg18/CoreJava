package arraysutil;

import java.util.Comparator;
//ARRAY SORT USING CUSTOM COMPARATOR
public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
