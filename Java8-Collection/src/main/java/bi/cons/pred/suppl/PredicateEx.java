package bi.cons.pred.suppl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {/* implements Predicate<Integer> {
							@Override
							public boolean test(Integer t) {
							if (t % 2 == 0)
							return true;
							else
							return false;
							}
							*/
	public static void main(String[] args) {
		/*	Predicate<Integer> pred = new PredicateEx();
			System.out.println("the no is : " + pred.test(100));
			System.out.println("the no is : " + pred.test(101));
		*/
		System.out.println("annonymoous app");
		Predicate<Object> pred = new Predicate<Object>() {

			@Override
			public boolean test(Object t) {
				if (t instanceof String)
					return true;
				else
					return false;
			}
		};

		System.out.println(pred.test("suresh"));
		System.out.println(pred.test(100));

		// lambda app

		System.out.println("======lambda app==========");
		Predicate<Integer> pred1 = t1 -> t1 % 2 == 0;

		System.out.println(pred1.test(101));
		System.out.println(pred1.test(100));
		System.out.println("=====================");

		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list1.stream().filter(pred1).forEach(t11 -> System.out.println("list : " + t11));
		list1.stream().filter(t111 -> (t111 % 2 == 0 || t111 % 2 == 1))
				.forEach(t111 -> System.out.println("list : " + t111));
		System.out.println("================");
		
		

	}

}
