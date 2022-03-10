package varargs.rules;
class A01{
		 void m1(int... ia){
	System.out.println("int A");
	}
}
class VARule14 extends A01{

	 void m1(int... ia){
	System.out.println("int V");
	}
	public static void main(String[] args) {
		VARule14 v=new VARule14();
		v.m1();
		v.m1(5);
//		v.m1(5l);

		A01 a=new VARule14();
		a.m1();
		a.m1(5);
//		a.m1(5l);//CE : cannot be applied to given types
	}
}
