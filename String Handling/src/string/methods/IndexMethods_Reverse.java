package string.methods;

//finding the index of given char/substr first occurence from 0 index & from the given index
//finding the index of given char/substr last occurence from last index & from the given index 
//public int indexOf(char ch)
//public int indexOf(String s)
//public int indexOf(char ch,int fromIndex)
//public int indexOf(String ch, int fromIndex)
//public int lastIndexOf(char ch)
//public int lastIndexOf(String s)
//public int lastIndexOf(char ch,int fromIndex)
//public int lastIndexOf(String ch, int fromIndex)
public class IndexMethods_Reverse {

	public static void main(String[] args) {
		String s = "java is a programming language";

		System.out.println(s.length());
		System.out.println(s.indexOf(2));// public int indexOf(int ch) {return indexOf(ch, 0);}
		System.out.println(s.lastIndexOf(2)); // public int lastIndexOf(int ch) { return lastIndexOf(ch, length() - 1);}

		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf('a'));
		System.out.println("============");
		System.out.println(s.indexOf("a", 5));
		System.out.println(s.lastIndexOf("a", 5));
		System.out.println(s.indexOf('a', 5));
		System.out.println(s.lastIndexOf('a', 5));
		System.out.println(s.indexOf('a', 1));
		System.out.println(s.indexOf("is"));
		System.out.println(s.indexOf('a', 2));
		System.out.println("==================");
		String s1 = "hello workd im using the things whihc are lwss claoss";
		StringBuffer sb = new StringBuffer(s1);
		StringBuffer sb1 = sb.reverse();

		System.out.println(sb1);

	}

}
