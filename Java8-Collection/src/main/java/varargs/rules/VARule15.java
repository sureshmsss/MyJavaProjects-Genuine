package varargs.rules;
class A011 {

}

public class VARule15 extends A011 {
	public void m1(int[] i) {
		System.out.println("int aray");
	}
	public static void main(String[] args) {
		VARule15 b1=new VARule15();
/*		b1.m1();
		b1.m1(5);
		b1.m1(new int[]{5});
		A011 a1=new VARule15();
		a1.m1();
		a1.m1(5);
		a1.m1(new int[]{56});
*/	}
}
