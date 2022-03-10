package j8.com.it.consumer;

import java.util.function.Consumer;

public class Test_Consumer_F_I_2 {
	public static void main(String[] args) {
		Consumer<Integer> con = (t) -> System.out.println("from direct main : " + t);
		con.accept(565544544);
	}
}