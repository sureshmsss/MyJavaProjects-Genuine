package string.methods;

//comparing string object data with data available in buffer and builder 
//public boolean contentEquals(StringBuffer cs)
//public boolean contentEquals(CharSequence cs)
//compareTo and compareToIgnoreCase and contentEquals both are should be of same type
public class String_Buffer_Builder {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "ABC";
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer(s1);
		StringBuilder sd1 = new StringBuilder("abc");
		StringBuilder sd2 = new StringBuilder(s1);
		StringBuilder sd5 = new StringBuilder(sb1);
		StringBuilder sd6 = new StringBuilder(sb2);

		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(sb1));
		System.out.println(s1.contentEquals(sb2));
		System.out.println("===========");
		System.out.println(s1.contentEquals(sd1));
		System.out.println(s1.contentEquals(sd2));
		// System.out.println(sd1.contentEquals(sd2));//CE: this method is undefined for
		// this type

	}
}
