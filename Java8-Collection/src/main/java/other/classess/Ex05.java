package other.classess;

public class Ex05 {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("c val :" + c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("p;ease enter two no.s");
		} catch (NumberFormatException e) {
			System.out.println("p;ease enter only no.s");
		} catch (ArithmeticException e) {
			System.out.println("p;ease enter valid no.s");
		} catch (Exception e) {
			System.out.println("p;ease enter two no.s");
		}
	}

}
