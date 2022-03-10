package other.classess;

public class Ex06 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("getmessage() :");
			System.out.println(e.getMessage());
			System.out.println("toString");
			System.out.println(e.toString());
			System.out.println("printStackTrace");
			e.printStackTrace();
			throw e;

		}
	}

}
