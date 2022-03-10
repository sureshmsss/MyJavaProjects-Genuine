package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {// implements Consumer<Integer> {
	/*
		// by implementing from consumer Interface
		@Override
		public void accept(Integer t) {
			System.out.println("t is " + t);
		}
	*/
	public static void main(String[] args) {
		//when implement consumer
//		Consumer<Integer> con = new ConsumerEx();
		Consumer<Integer> con = t -> System.out.println("t value is : " + t);
		con.accept(10);
		System.out.println("=================================");
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		list1.stream().forEach(con);
		System.out.println("==================================");
		list1.stream().forEach(t -> System.out.println("t  => " + t));

	}

}
