package string.ops;

public class Test01 {
	public static void main(String[] args) {
		String s1 = new String("a");
		String s2 = new String("a");
		System.out.println(s1 == s2);// false(checks hashcode)
		System.out.println(s1.equals(s2));// true(checks content(it is from String class)
		System.out.println(s1.hashCode()+"==hashcode=="+s2.hashCode());
		System.out.println("======================");
		StringBuffer sb1 = new StringBuffer(s2);
		StringBuffer sb2 = new StringBuffer("a");
		System.out.println(sb1 == sb2);//false(it uses reference(HC))
		System.out.println(sb1.equals(sb2));//false(equals() is not overridden it is from Object class)
		// System.out.println(s1==sb1);//CE: incompatible types
		System.out.println(s1.equals(sb1));//equals() is not overridden
		System.out.println(s1.equals(sb2));
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println("==================");
		sb1=sb2.append("hello");
		System.out.println(sb2);
		String s3=s1.concat(s2);
		System.out.println(s3);
		System.out.println("==========");
		s1=s1.concat(s2);
		System.out.println(s1);
	}

}
