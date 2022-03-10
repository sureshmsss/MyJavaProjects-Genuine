package string.ops;

public class Test2 {
	public static void main(String[] args) {
		String s1 = "a";
		String s2 = new String("a");
//		System.out.println(s1.length());
		System.out.println(System.identityHashCode(s1));//.length());
		s2=null;
		System.gc();
	}

}
