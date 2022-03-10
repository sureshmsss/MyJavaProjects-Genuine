package other.classess;

public class Eh_01 {
	public static void main(String[] args) {
		try {
			System.out.println("froom outer try ");
			try {
				System.out.println("from inner try");
				System.out.println(1 / 0);
			} catch (NumberFormatException e1) {
				System.out.println("from inner catch NFE");
				System.out.println(e1.toString());
			}
		} catch (ArithmeticException e) {
			System.out.println("from outer catch AE");
			try {
				System.out.println("from inner try of an outer trycatch");
				System.out.println(1 / 0);
			} catch (ArithmeticException e1) {
				System.out.println(e1.toString());
			}
			System.out.println("result from outer catch of other trycatch:" + (5 + 6));
		} finally {
			System.out.println("ex");
		}

	}
}
