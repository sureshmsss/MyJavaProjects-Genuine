package j8.com.it.consumer;
@FunctionalInterface
public interface Test_F_I {
	public void test();

	public static void test1() {
		System.out.println("static method from interface");
	}

	default void test2() {
		System.out.println("default method from interface");
	}
}
