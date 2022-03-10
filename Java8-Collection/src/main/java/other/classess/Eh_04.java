package other.classess;

public class Eh_04 {
	static void m1(int a) {
		if (a > 0) {
			throw new ArithmeticException();
		}
	}

	public static void main(String[] args) {
		m1(-5);
		System.out.println("hil");

	}
}