package java8.stream.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(1);
		list.add(6);
		list.add(9);
		list.add(7);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println("---------Ascending----------");
		list.stream().sorted().forEach(s->System.out.println(s));//asscending
		System.out.println("==========descending==========");
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));
		
	}

}
