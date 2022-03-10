package string.tests;
// when the data is over than user defined capacity=>new Cap=oldCap+(2*oldCap)+2

// when the data is over than max capacity,=>new Cap= oldCap+(2*oldCap)+2

public class StringBuilderClass {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder(5);
		StringBuilder sb3 = new StringBuilder("hllo");
		StringBuilder sb4 = new StringBuilder();
		StringBuilder sb5 = new StringBuilder(sb3);
		StringBuilder sb6 = new StringBuilder("hllo");
		sb2.append("123456");
		System.out.println("=========");
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb3 : " + sb3);
		System.out.println("sb4 : " + sb4);
		System.out.println("sb5 : " + sb5);
		System.out.println("sb6 : " + sb6);
		System.out.println("=========");

		System.out.println("sb1.hc : " + sb1.hashCode());
		System.out.println("sb2.hc : " + sb2.hashCode());
		System.out.println("sb3.hc : " + sb3.hashCode());
		System.out.println("sb4.hc : " + sb4.hashCode());
		System.out.println("sb5.hc : " + sb5.hashCode());
		System.out.println("sb6.hc : " + sb6.hashCode());
		System.out.println("=========");
		System.out.println("sb1 cap : " + sb1.capacity());
		System.out.println("sb2 cap : " + sb2.capacity());

	}
}
