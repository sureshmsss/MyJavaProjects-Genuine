package supplier.predicate.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class ConsumerDemo implements Consumer<Integer> {
	@Override
	public void accept(Integer t) {
		System.out.println("from accept() : " + t);
	}
}

public class ConsumerDemo1 {
	public static void main(String[] args) {

		// by taking class implemented from Consumer(I)
		ConsumerDemo d = new ConsumerDemo();
		d.accept(12354);
		System.out.println("=============");

		// without implementing Consumer(I)+doing by lambda
		Consumer<Object> c = t -> System.out.println("from lambda of consumer : " + t);

		c.accept(4654654);

		System.out.println("==================");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		list.stream().forEach(t -> System.out.println("print : " + t));// can do in 1 line
		list.stream().forEach(c);// can do in more than 1 line

	}
}
