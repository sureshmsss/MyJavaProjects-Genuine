package other.classess;

public class EhC001 {
	static int m1() {
		try {
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
		} catch (Exception e) {
			System.out.println("5");
			System.out.println("6");
			System.out.println("7");
			return 0;
		} finally {
			System.out.println("8");
			return 0;
		}

	}

	public static void main(String[] args) {
		int x = m1();
		System.out.println(x);
	}

}
