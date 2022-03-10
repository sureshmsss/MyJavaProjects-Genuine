package varargs.rules;
class  VARule08{
	//Rule#8 : if the method call is coming with different value means 
	//not matching datatype then its heirarchy type method will takes that
	//value and executes its method call

	static void m1(int a){
		System.out.println("int param"+a);
	}
	static void m1(long a){
		System.out.println("long param"+a);
	}
	static void m1(double a){
		System.out.println("double param"+a);
	}
/*	static void m1(float a){
		System.out.println("float param"+a);
	}*/
	static void m1(boolean... a){
		System.out.println("boolean param"+a);
	}

	public static void main(String[] args) {
		m1(4);
		m1(4456865l);
		m1(445.0);
		m1(401.0f);
		m1(true,false);
		System.out.println("Hello World!");
	}
}
