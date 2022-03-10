package string.methods;

import java.util.Arrays;
import java.util.StringTokenizer;

//retrieving substring fixed substring and dynamic substring
//public String substring(int start)
//public String substring(int start,int end)
//split the given string into tokens
//public String[] split(String delim)
public class SubString_Split_StringTokenizer {

	public static void main(String[] args) {
		String s1 = "java is giving very huge number of programming concepts";
		System.out.println(s1.substring(4));// public String substring(int beginIndex) { return
											// substring(beginIndex,length());}
		System.out.println(s1.substring(5, 10));
//		System.out.println(s1.substring(-1, 5));
//		System.out.println(s1.substring(-2, 5));

		System.out.println("==============");
		String[] sa2 = s1.split(" ");
		String[] sa3 = s1.split("a");
		System.out.println(Arrays.toString(sa2));
		System.out.println(Arrays.toString(sa3));
		String[] sa4 = s1.split("g");
		System.out.println(Arrays.toString(sa4));
		String[] sa5 = s1.split(".");
		System.out.println(Arrays.toString(sa5));
		String[] sa6 = s1.split("r");
		System.out.println(Arrays.toString(sa6));
		System.out.println("===========================");
		StringTokenizer st1 = new StringTokenizer("hello world this is suresh maheshuni");
		StringTokenizer st2 = new StringTokenizer("hello world this is slang blog klodg", "l");
		StringTokenizer st3 = new StringTokenizer("hello world this is slang blog klodg ", "l", true);
		while (st1.hasMoreTokens()) {
			String token = st1.nextToken();
			System.out.println(token);
		}
		System.out.println("=============");
		while (st2.hasMoreTokens()) {
			String token = st2.nextToken();
			System.out.println(token);
		}
		System.out.println("=============");
		while (st3.hasMoreTokens()) {
			String token = st3.nextToken();
			System.out.println(token);
		}
	}
}
