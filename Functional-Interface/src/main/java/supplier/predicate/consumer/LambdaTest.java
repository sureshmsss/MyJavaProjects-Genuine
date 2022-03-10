package supplier.predicate.consumer;

@FunctionalInterface
interface Fi01 {
	String transferred(String city);

	default void m1() {
	}

	static void m2() {
	}
}

public class LambdaTest {
	public static void main(String[] args) {

		Fi01 fi01 = (city) -> {
			return city;
		};
		System.out.println(fi01.transferred("122"));
		Fi01 fi02 = (city) -> {
			String msg = city;
			return msg;
		};
		System.out.println(fi02.transferred("hyd"));
		System.out.println("======================");
		Fi01 fi03 = (city) -> {
			return city;
		};
		System.out.println(fi03.transferred("hyd"));

		System.out.println("======================");
		Fi01 fi04 = (city) -> city;
		System.out.println(fi04.transferred("hyd"));
		System.out.println("======================");

	}

}
