package bi.cons.pred.suppl;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConEx implements BiConsumer<String, Integer> {
	@Override
	public void accept(String t, Integer u) {
		System.out.println(t + "=>" + u);

	}

	public static void main(String[] args) {
		BiConsumer<String, Integer> bc1 = new BiConEx();
		bc1.accept("suresh", 1000);
		System.out.println("=========");

		BiConsumer<String, Integer> bc2 = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println("from anonymous app");
				System.out.println(t + "=>" + u);
			}
		};
		bc2.accept("mahesh", 2000);
		System.out.println("========");
		BiConsumer<String, Integer> bc3 = (s, i) -> {
			System.out.println("lambda app");
			System.out.println(s + "=>" + i);
		};
		System.out.println("========");
		bc3.accept("ms", 20000);

		Map<String, Integer> m = new HashMap<>();
		m.put("a", 100);
		m.put("b", 200);
		m.put("c", 300);

		m.forEach(bc2);
		System.out.println("=========");
		m.forEach((k, v) -> System.out.println(k + "-" + v));
	}

}
