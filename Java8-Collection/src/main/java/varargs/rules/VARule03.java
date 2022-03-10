package varargs.rules;
class  VARule03{
//	void m1(int... ia1){}
//	void m1(int ...ia2){}//CE : already defined
//	void m1(int ia...){}
//	void m1(...int ia){}
	void m1(int...ia){
		System.out.println("int...ia param");
	}//CE : already defined
	public static void main(String[] args) {
		VARule03 v=new VARule03();
		v.m1(45,56,85);

		System.out.println("Hello World!");
	}
}
