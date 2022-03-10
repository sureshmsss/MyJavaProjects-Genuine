package comparator.ss.it.beans;

import java.util.Collections;
import java.util.List;

public class ITServices {
	/*
	 * public List<IT> getSortedIt(){ List<IT> list=new ITDao().getIt();
	 * Collections.sort(list,new ITComparator()); return list; }
	 */
	/*
	 * public List<IT> getSortedIt() { System.out.println("from ITServices");
	 * List<IT> list = new ITDao().getIt(); Collections.sort(list, new
	 * Comparator<IT>() {
	 * 
	 * @Override public int compare(IT o1, IT o2) { return
	 * o2.getName().compareTo(o1.getName()); } }); return list; }
	 */
	public List<IT> getSortedIt() {
		System.out.println("from ITServices");
		List<IT> list = new ITDao().getIt();
		Collections.sort(list, (o1, o2) -> o1.getName().compareTo(o2.getName()));
		return list;
	}

	public static void main(String[] args) {
		System.out.println(new ITServices().getSortedIt());
	}
}
