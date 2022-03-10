package string.methods;
//String objects joining with some delimiters

//public String join(String delim,CharSequence... cs)

public class Join_UpperCase_LowerCase {
	public static void main(String[] args) {
		String s1 = "hello java is  hery huge";// programming concepts to belonging to the industry of software";

		String s2 = String.join(s1, "AAA", "BBB", "CCC");
		System.out.println(s2);
		System.out.println("==================");
		String s3 = String.join(s1, "-", "=");
		System.out.println(s3);
		String s4 = String.join(s1, new StringBuffer("$"), new StringBuilder("&"));
		System.out.println(s4);
		System.out.println("=============");
		String s5 = s1.toLowerCase();
		System.out.println(s5);
		String s6 = s1.toUpperCase();
		System.out.println(s6);
		String s7 = "aBBc";
		String s8 = "A@#$$2C";
		System.out.println(s7.toUpperCase());
		System.out.println(s8.toLowerCase());
		System.out.println(s8.toUpperCase());
		
		String[] sa=new String[5];
		//System.out.println(sa[0].toUpperCase()+"="+sa[1].toLowerCase());//RE: sa[0] is null

	}
}
