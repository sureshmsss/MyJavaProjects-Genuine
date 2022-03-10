package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {/*implements Supplier<String> {
							}
							@Override
							public String get() {
							return "hi get() of Supplier";
							}
							*/
	public static void main(String[] args) {
		Supplier<String> sup = new Supplier<String>() {

			@Override
			public String get() {
				return "hello this is anonymous supplier get()";
			}
		};
		System.out.println(sup.get());
		System.out.println("======================");
		// lambda approach

		Supplier<String> sup1 = () -> "hi this is lambda approach";
		System.out.println("=============");
		System.out.println(sup1.get());

		List<String> list = Arrays.asList("a", "b");
		System.out.println(list.stream().findAny().orElseGet(sup1));

	}
}
