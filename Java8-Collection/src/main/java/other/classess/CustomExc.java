package other.classess;

public class CustomExc extends Exception {
	public CustomExc() {
		super();
	}

	public CustomExc(String s) {
		super(s);
	}

	public static void main(String[] args) throws CustomExc {
		int i = 10;
		try {
			if (i == 0) {
				throw new CustomExc(i + "arithmatic exception");
			}
		} catch (ArithmeticException e) {
		}

	}

}
