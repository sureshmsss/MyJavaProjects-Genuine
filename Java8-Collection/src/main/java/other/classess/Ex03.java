package other.classess;

public class Ex03 {

	public static void main(String[] args){
		int a=10;
		System.out.println("hello world");
		try{
			System.out.println("suresh doiong ");
			System.out.println("a value is :"+a/0);
			
		}catch(ArithmeticException e){
			System.out.println("pleade enter +ve no");
		}
		catch(NumberFormatException e){
			System.out.println("please enter noumbers only");
		}
		finally{
			System.out.println("thanking you for visiting Ss solutions");
		}
	}

}
