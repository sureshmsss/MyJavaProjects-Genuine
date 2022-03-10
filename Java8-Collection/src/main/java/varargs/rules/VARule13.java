package varargs.rules;
class A{
		 void m1(int... ia){
	System.out.println("A int");
	}
}
class VARule13 extends A{

	 void m1(long... ia){
	System.out.println("VAR long");
	}
	public static void main(String[] args) {
		VARule13 v=new VARule13();
		v.m1();
		v.m1(5);
		v.m1(5l);

		A a=new VARule13();
		a.m1();
		a.m1(5);
	//	a.m1(5l);//CE : cannot be applied to given types

		System.out.println("Hello World!");
	}
}
