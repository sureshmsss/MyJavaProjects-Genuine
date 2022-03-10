package fundamental.classess;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CM004 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(0);
		list.add(5);
		List<Integer> list1 = new LinkedList<>();
		list.add(2);
		list.add(0);
		list.add(4);

		List<Integer> list2 = new LinkedList<>();
		list2.add(4);
		System.out.println(list.contains(list1));
	}
}
