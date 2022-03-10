package varargs.rules;
class A001 {
	void m1(int[] i) {
		System.out.println("int array");
	}
}

class VARule16 extends A001 {
	void m1(int... i) {
		System.out.println("int var arg");
	}

	public static void main(String[] args) {
		VARule16 b1=new VARule16();
		b1.m1();
		b1.m1(5);
		b1.m1(new int[]{5});
		A001 a1=new VARule16();
//		a1.m1();
//		a1.m1(5);
		a1.m1(new int[]{56});
	}

}
