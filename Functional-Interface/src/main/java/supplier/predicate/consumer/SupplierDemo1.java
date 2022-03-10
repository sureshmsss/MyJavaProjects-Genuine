package supplier.predicate.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

class SupplierDemo implements Supplier<String> {
	@Override
	public String get() {
		return "my name is suresh";
	}
}

public class SupplierDemo1 {
	public static void main(String[] args) {
		SupplierDemo d = new SupplierDemo();
		System.out.println(d.get());

		System.out.println("================");
		Supplier supplier = () -> {
			return "suresh is learning java";
		};

		System.out.println(supplier.get());
		System.out.println("======================");
		List<String> list = Arrays.asList("a", "b", "c");

		System.out.println(list.stream().findAny().orElseGet(() -> "old thing is available"));

	}

}
