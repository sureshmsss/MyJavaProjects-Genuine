package j8.com.it.consumer;

import java.util.function.Consumer;

public class Test_Consumer_F_I_1 implements Consumer<Integer>{
	@Override
	public void accept(Integer t) {
		System.out.println("accept");
	}

	public static void main(String[] args) {
		Test_Consumer_F_I_1 con=new Test_Consumer_F_I_1();
		con.accept(5);
		
	}
}
