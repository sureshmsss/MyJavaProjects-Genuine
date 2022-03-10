package other.classess;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			System.out.println(2/0);
			System.out.println(3);
			System.out.println(4);
		} catch (ArithmeticException e) {

			System.out.println(5/0);
			System.out.println(6);
			System.out.println(7);
		} finally {
			System.out.println(8/0);
		}
		System.out.println(9);

	}

}
