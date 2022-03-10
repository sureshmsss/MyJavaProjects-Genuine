package bi.cons.pred.suppl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFnEx implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

	@Override
	public List<Integer> apply(List<Integer> list1, List<Integer> list2) {

		return Stream.of(list1, list2).flatMap(List::stream).distinct().collect(Collectors.toList());
	}

	public static void main(String[] args) {
		BiFunction b = new BiFnEx();
		List<Integer> l1 = Stream.of(1, 3, 4, 3, 5, 8, 7, 0, 6, 9).collect(Collectors.toList());
		List<Integer> l2 = Stream.of(3, 4, 5, 8, 0, 6, 9).collect(Collectors.toList());
		System.out.println("traditional app : " + b.apply(l1, l2));

		// anonymous approach
		BiFunction<List<Integer>, List<Integer>, List<Integer>> bf1 = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

			@Override
			public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
				System.out.println("from anonymous app");
				return Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
			}
		};

		System.out.println("anonymous : " + bf1.apply(l1, l2));

		// lambda approach

		BiFunction<List<Integer>, List<Integer>, List<Integer>> bf2 = (l11, l22) -> {
			return Stream.of(l11, l22).flatMap(List::stream).distinct().collect(Collectors.toList());
		};

		System.out.println("lambda approach : " + bf2.apply(l1, l2));

		Map<String, Integer> m = new HashMap<>();
		m.put("a", 500);
		m.put("b", 600);
		m.put("c", 700);

		BiFunction<String, Integer, Integer> bsal = new BiFunction<String, Integer, Integer>() {

			@Override
			public Integer apply(String t, Integer u) {

				return u + 50;
			}
		};
		m.replaceAll(bsal);
		System.out.println("Map rplace addign 50 : " + m);

		BiFunction<String, Integer, Integer> bsal1 = (s, v) -> v + 50;

		m.replaceAll(bsal1);

		System.out.println("lambada adding again 50 will 00: " + m);

		Function<List<Integer>, List<Integer>> fn = (l111) -> l111.stream().sorted().collect(Collectors.toList());
		System.out.println("lambda app andThen Method : " + bf1.andThen(fn).apply(l1, l2));

	}

}
