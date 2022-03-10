package other.classess;

public class Eh003 extends Exception {
	public Eh003() {
		super("hello");
		System.out.println("0-param constructor");
	}

	public static void main(String[] args) {
		System.out.println("hello darling");
		Eh003 e1=new Eh003();

	}

}
