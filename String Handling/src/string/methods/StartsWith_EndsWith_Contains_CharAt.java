package string.methods;

//reading character at the index 
//public char charAt(int index)
//searching for substring anywhere in the current string
//public boolean contains(String s)
//checking with the string starting and ending with the given string data
//public boolean startsWith(String s)
//public boolean endsWith(String s)
public class StartsWith_EndsWith_Contains_CharAt {

	public static void main(String[] args) {
		String s1 = " . . ";
		String s2 = "abfdfdfc";
		String s3 = "ABkjfkfsdfC";

		String s4 = new String(" ds sf fsf");
		String s5 = new String();
		String s6 = new String("abjfj sdsfc");
		String s7 = new String("AkfdfBC");

		// System.out.println(s1.charAt(12));
		System.out.println(s1.charAt(1));
		System.out.println(s2.charAt(5));
		System.out.println(s6.charAt(5));
//			System.out.println(s6.charAt(-5));//no -ve number
		System.out.println(s7.charAt(5));
		// System.out.println(s7.charAt('a'));// a means 97 bcoz single quotes

		System.out.println("====================");
		System.out.println(s2.contains("d"));
		System.out.println(s2.contains("a"));
		System.out.println(s2.contains("g"));
		System.out.println(s2.contains("t"));
		System.out.println("==============");
		String s11 = "hello world thank you";
		System.out.println(s11.endsWith("d"));
		System.out.println(s11.startsWith("j"));
		System.out.println(s11.startsWith("h"));
		System.out.println(s11.endsWith("u"));

	}

}
