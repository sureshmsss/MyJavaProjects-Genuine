package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class evenTest {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		for (Integer i : list) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("------------------");
		Consumer<Integer> con=t->{
			if(t%2==0) {
				System.out.println(t);
			}
		};
		list.forEach(con);
		System.out.println("---------------------");
		
		list.stream().filter(t->t%2==0).forEach(t->System.out.println(t));
	}
}
