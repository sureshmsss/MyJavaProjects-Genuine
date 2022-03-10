package comparator.ss.it.beans;

import java.util.Comparator;

public class ITComparator implements Comparator<IT> {

	@Override
	public int compare(IT o1, IT o2) {
		System.out.println("from ITComparator");

		return o1.getName().compareTo(o2.getName());
	}

}
