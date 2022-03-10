package string.methods;
//converting string to character array Object

//converting String to byte arrays object
//public char[] toCharArray[]
//public byte getBytes()
//converting any data type including primitive  types into String
//public String valueOf(xxx value)
//String object concatenation
//public String concat(String s)

public class ToString_ValueOf_Concat {

	public static void main(String[] args) {
		String s1 = "hari";
		// System.out.println(s1);
		char[] ch1 = s1.toCharArray();
		System.out.println(ch1);
		byte[] b1 = { 'a', 'b', 'c', 'd' };
		byte[] b2 = s1.getBytes();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("=================");
		String i = "10";

		String b = "false";
		System.out.println(s1.valueOf(b));
		System.out.println(s1.concat("is ").concat("the").concat("hk").concat("product"));

	}

}
