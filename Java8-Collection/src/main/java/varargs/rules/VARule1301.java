package varargs.rules;
class A0111{
		 void m1(long... ia){
	System.out.println("long A");
	}
		void m2(){
		System.out.println("A");
	}

}
class VARule1301 extends A0111{

	 void m1(int... ia){
	System.out.println("int VRA");
	}
	void m2(){
		System.out.println("VRA");
	}
	public static void main(String[] args) {
		VARule1301 v=new VARule1301();
		v.m1();
		v.m1(5);
	//	v.m1(5l);
		System.out.println("---");
		A0111 a=new VARule1301();
		a.m1();
		a.m1(5);
	//	a.m1(5l);//CE : cannot be applied to given types
		System.out.println("---");
	//	a.m2();
		v.m2();
		System.out.println("Hello World!");
	}
}
