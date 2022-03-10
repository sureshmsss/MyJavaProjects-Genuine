package varargs.rules;
class VARule07{

	//Rule#7 : the var arg parameter can allows any no of values

	static void m1(){
	System.out.println("m1() ");
	}
	static void m1(int a){
		System.out.println("m1(int a) ");
}
	static void m1(int... a){
			System.out.println("m1(int... a) ");
}

	public static void main(String[] args) {
		m1(5);
		m1(4,5);
		m1(4,5,6);
		System.out.println("Hello World!");
	}
}
