package other.classess;

public class Ex07 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
		} catch (ArithmeticException e) {
			System.out.println("4");
			System.out.println(4 / 0);
			System.out.println("5");
		}
		System.out.println("6");

	}

}
