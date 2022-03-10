package string.methods;

//to print object data as string
//public String toString()
//to retrieve the hashCode of the Object
//public int hashCode()
//to retrieve the identityHashcode() of the object
//  public static native int identityHashCode(Object x)//== operator internally uses this IdHcode() only not Hashcode() method

public class ToString_HashCode {

	public static void main(String[] args) {
		String s1 = "452633";
		String s2 = "452633";
		String s3 = new String("452633");
		System.out.println(s1);
		A a1 = new A();
		A a2 = new A();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1.toString());
		System.out.println(a2.toString());

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println("s1 ==s2 : " + (s1 == s2));
		System.out.println("s1 == s3 : " + (s1 == s3));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("a1 == a2 : " + (a1 == a2));
		System.out.println("=====");
		System.out.println(System.identityHashCode(a1));
		System.out.println(System.identityHashCode(a2));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
	}

}

class A {
	private int a;
	private int b;
public A() {
	// TODO Auto-generated constructor stub
}
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "A=>a-" + a + ", b-" + b;
	}

}
