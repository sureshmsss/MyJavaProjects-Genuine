package supplier.predicate.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class PredicateDemo implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}
}

public class PredicateDemo1 {
	public static void main(String[] args) {
		PredicateDemo p = new PredicateDemo();
		System.out.println(p.test(100));
		System.out.println(p.test(101));
		System.out.println(p.test(103));
		System.out.println(p.test(104));
		System.out.println("====================");

		Predicate<Integer> isEven = t -> t % 2 == 0;

		System.out.println(isEven.test(123));
		System.out.println(isEven.test(122));

		System.out.println("=====================");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		numbers.stream().filter(k -> k % 2 == 0).forEach(l -> System.out.println("the even number is " + l));
		System.out.println("=====================");

		numbers.forEach(l -> {
			if (l % 2 == 0)
				System.out.println("is even : " + l);
			else
				System.out.println("is odd : " + l);
		});
	}
}