package varargs.rules;
class VARule06{

	//Rule#6 : the var arg parameter must be only 
	//or
	//should be lost parameter in that method

	//static void m1(int... a,int... b){}//CE
	//static void m1(int... a,String... b){}//CE
	public static void main(String[] args) {
	//	m1(4,65,88);
		System.out.println("Hello World!");
	}
}
