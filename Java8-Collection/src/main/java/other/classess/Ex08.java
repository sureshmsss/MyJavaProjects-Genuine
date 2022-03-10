package other.classess;

public class Ex08 {

	public static void main(String[] args) {
		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println(2/0);
		} catch (ArithmeticException e) {
			System.out.println("4");
			try{
				System.out.println("inner try");
				System.out.println(10/0);
			}catch(ArithmeticException a){
				System.out.println("inner catch");
			}
			System.out.println("6");
		}
		System.out.println("7");


	}

}
