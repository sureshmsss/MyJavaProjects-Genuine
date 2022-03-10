package string.methods;

//replacing old char / sub string with new char / suv string
//replacing old char / sub string with new char / suv string with regular expression
//public String replace(char oc,char nc)
//public String replace(CharSequence oc,char nc)
//public String replaceAll(String regex,String nString)
//public String replaceFirst(String regex,String nString)

public class Replace_Trim_Intern {

	public static void main(String[] args) {
		String s1 = "hello world i'm using java to programming";
		String s2 = s1.replace('a', 'k');
		System.out.println(s2);
		String s3 = s1.replace("s", "o");
		System.out.println(s3);
		String s4 = "abc.txt";
		String s5 = s4.replace(".", " &");
		System.out.println(s5);
		String s6 = s1.replaceAll("using java", "saying hi");
		System.out.println(s6);
		String s7 = s1.replaceFirst("hello", "my dear");
		System.out.println(s7);
		String s8 = s1.replaceAll("o", "##");
		System.out.println(s8);
		String s9 = s8.replaceAll("#", "@");
		System.out.println(s9);
		System.out.println("====================");
		String s11 = s1.trim();
		System.out.println(s11);
		String s12 = "   dd df   fff    ";
		String s13 = s12.trim();
		System.out.println(s13);
		System.out.println("========================");
		String s21 = "suresh maheshuni";
		String s22 = s21.intern();
		System.out.println(s22);
		String s23 = new String("surehshs");
		String s24 = s23.intern();

		System.out.println(s24);
	}

}
