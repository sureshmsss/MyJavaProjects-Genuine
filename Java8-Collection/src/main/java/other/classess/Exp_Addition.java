package other.classess;

public class Exp_Addition {
	void m1() {
		int x;
	}

	public static void main(String[] args) {
		try {
			int a = 10;

			int b = 0;
			double c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("enter valid not other than zero");
			e.printStackTrace();
		}
	}

}
