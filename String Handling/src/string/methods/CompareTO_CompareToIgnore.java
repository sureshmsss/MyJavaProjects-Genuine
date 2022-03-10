package string.methods;

//comparing strings lexico graphically for Sorting purpose
//public int compareTo(String s)
//public int compareToIgnoreCase(String s)//internally uses compare(this,str) method
//
public class CompareTO_CompareToIgnore {

	public static void main(String[] args) {

		String s1 = " ";
		String s2 = "abc";
		String s3 = "ABC";

		String s4 = new String(" ");
		String s5 = new String();
		String s6 = new String("abc");
		String s7 = new String("ABC");
		String s8 = new String(s3);

		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s6.compareTo(s7));
		System.out.println(s7.compareTo(s8));
		System.out.println(s7.compareTo(s2));
		System.out.println("=================");
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s3.compareToIgnoreCase(s2));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s6.compareToIgnoreCase(s7));
		System.out.println(s7.compareToIgnoreCase(s8));
		System.out.println(s7.compareToIgnoreCase(s2));

	}
}
