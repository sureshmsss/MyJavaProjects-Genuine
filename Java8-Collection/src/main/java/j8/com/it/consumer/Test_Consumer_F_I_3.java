package j8.com.it.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test_Consumer_F_I_3 {
	public static void main(String[] args) {
		Consumer<Integer> con = (t) -> System.out.println("from direct main : " + t);
		con.accept(565544544);
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		list1.stream().forEach(con);
		//type-2
		list1.stream().forEach((t)->System.out.println("printing :"+t));

	}
}