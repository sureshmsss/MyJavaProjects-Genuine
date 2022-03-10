package string.tests;

public class StringClass {
	public static void main(String[] args) {
		String s = "abc";
		String s1 = new String();
		String s2 = new String(s1);
		String s3 = new String("abc");
		String s4 = new String("bbc");
		String s5 = s4;
		char[] ch = { 'a', 'b', 'c', 'd' };
		String s6 = new String(ch);
		String s7 = new String(ch, 2, 1);
		byte[] b = { 94, 95, 96, 97, 98, 99 };
		String s8 = new String(b);
		String s9 = new String(b, 3, 3);
		String s10 = null;// NO CE & RE when you use only CE or RE will come
		// String s11 = new String(s10);// RE:-NPE
		String s12 = "null";
		String s13 = new String(s12);
		System.out.println("s  : " + s);
		System.out.println("s1  : " + s1);
		System.out.println("s2  : " + s2);
		System.out.println("s3  : " + s3);
		System.out.println("s4  : " + s4);
		System.out.println("s5  : " + s5);
		System.out.println("s6  : " + s6);
		System.out.println("s7  : " + s7);
		System.out.println("s8  : " + s8);
		System.out.println("s9  : " + s9);
		System.out.println("s10  : " + s10);
		// System.out.println("s11 : " + s11);
		System.out.println("s12  : " + s12);
		System.out.println("s13  : " + s13);
		System.out.println("==========");
		System.out.println("s  : " + s.hashCode());
		System.out.println("s1  : " + s1.hashCode());
		System.out.println("s2  : " + s2.hashCode());
		System.out.println("s3  : " + s3.hashCode());
		System.out.println("s4  : " + s4.hashCode());
		System.out.println("s5  : " + s5.hashCode());
		System.out.println("s6  : " + s6.hashCode());
		System.out.println("s7  : " + s7.hashCode());
		System.out.println("s8  : " + s8.hashCode());
		System.out.println("s9  : " + s9.hashCode());
	//	System.out.println("s10  : " + s10.hashCode());//RE:- NPE
		System.out.println("s12  : " + s12.hashCode());
		System.out.println("s13  : " + s13.hashCode());
		System.out.println("s13  : " + s13.hashCode());

	}

}
