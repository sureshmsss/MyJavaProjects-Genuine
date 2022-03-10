package other.classess;

public class Eh002 {

	public static void main(String[] args) {
		try {
			System.out.println("hello from try1");
			// System.out.println(5 / 0);
			try {
				System.out.println("hello from try2");
				System.out.println(5 / 0);
			} catch (Exception e) {
				System.out.println("hello from inner try2-catch");
			}
		} catch (ArithmeticException a) {
			System.out.println("hello from try1-catch1");
			try {
				System.out.println("hello from inner catch try");
				System.out.println(5 / 0);
			} catch (Exception e) {
				System.out.println("hello from inner caTCH-catch");
			}
		} finally {
			System.out.println("thank you for using");
		}

	}

}
