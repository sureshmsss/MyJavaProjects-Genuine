package varargs.rules;
class VARule02{

	//Rule#2 : to represent var arg 
	//give datatype and after datatypes put three dots only

	void m1(int... ia){}
//	void m1(int.. ia){}
//	void m1(int.... ia){}
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
