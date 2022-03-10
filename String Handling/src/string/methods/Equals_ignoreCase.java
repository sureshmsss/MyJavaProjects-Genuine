package string.methods;
//comparing objects for equality with  & withoutCaseSensitive
//public boolean equals(Object o)
//public boolean equalsIgnoreCase(Object o)

public class Equals_ignoreCase {

	public static void main(String[] args) {
		String s1 = " ";
		String s2 = "abc";
		String s3 = "ABC";

		String s4 = new String(" ");
		String s5 = new String();
		String s6 = new String("abc");
		String s7 = new String("ABC");
		String s8 = new String(s2);
		String s9;//="";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equals(s3));
		System.out.println(s6.equals(s7));
		System.out.println(s7.equals(s8));
		System.out.println(s7.equals(s3));
		System.out.println("=============");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s6.equalsIgnoreCase(s7));
		System.out.println(s7.equalsIgnoreCase(s8));
		System.out.println(s7.equalsIgnoreCase(s3));
		System.out.println("=============");
		A a1=new A(5, 6);
		A a2=new A(6, 6);
		System.out.println(a1.equals(a1));
		System.out.println(a1.equals(a2));

	}

}
