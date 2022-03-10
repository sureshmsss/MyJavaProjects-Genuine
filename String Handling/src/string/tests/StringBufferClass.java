package string.tests;
//when the data is over than user defined capacity=>new Cap=oldCap+(2*oldCap)+2

//when the data is over than max capacity,=>new Cap= oldCap+(2*oldCap)+2

public class StringBufferClass {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();
		sb1.append("ahehe");
		StringBuffer sb2 = new StringBuffer("hello");
		StringBuffer sb3 = new StringBuffer(sb1);
		StringBuffer sb4 = new StringBuffer();
		StringBuffer sb5 = new StringBuffer(5);
		sb5.append("4564f");// when the data is over than user defined capacity=>new Cap=
							// oldCap+(2*oldCap)+2
		sb4.append("0123456789123456");// when the data is over than max capacity,=>new Cap= oldCap+(2*oldCap)+2
		System.out.println("=========");
		System.out.println("sb1 : " + sb1);
		System.out.println("sb2 : " + sb2);
		System.out.println("sb3 : " + sb3);
		System.out.println("sb4 : " + sb4);
		System.out.println("sb5 : " + sb5);
		System.out.println("=========");

		System.out.println("sb1.hc : " + sb1.hashCode());
		System.out.println("sb2.hc : " + sb2.hashCode());
		System.out.println("sb3.hc : " + sb3.hashCode());
		System.out.println("sb4.hc : " + sb4.hashCode());
		System.out.println("sb5.hc : " + sb5.hashCode());
		System.out.println("=========");
		System.out.println("sb related : " + sb2.capacity());
		System.out.println("sb related : " + sb4.capacity());
		System.out.println("sb related : " + sb5.capacity());

	}
}
