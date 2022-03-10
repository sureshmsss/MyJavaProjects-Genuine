package varargs.rules;
class VARule05{

	//Rule05# : if you place only var arg in the method,
	//if method is calling without values,
	//it consider that one argument with zero values are coming 

	//static void m1(int... ia, int a, int b){}//CE
	//static void m1(int a,int... ia, int b){}//CE

	static void m1(int a){}
	static void m1(int a, int b, int... ia){
		System.out.println("\n a :"+a);
		System.out.println("\n b :"+b);
		System.out.println("ia :"+java.util.Arrays.toString(ia));
	}
	public static void main(String[] args) {
		m1(452,45,45,'a');
		//m1(10);//no such method available
		m1(44,55);
		
		System.out.println("Hello World!");
	}
}
