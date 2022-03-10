package varargs.rules;
class Employee{
int sno;


}
class VARule01{
//var arg is not a variable just a parameter and 
//also you can pass multiple values or array object but,
//we cant use as a variable
	//int... ia;//CE : c f s
	void m1(String... ia){
		System.out.println(" S param");
	}
	void m1(Thread... ia){
		System.out.println(" Thread param");
	}
	void m1(Integer... ia){
		System.out.println(" Integer param");
	}
/*	void m2(Employee... ia){
		System.out.println(" Integer param");//CE: Mismatch 
	}*/
	void m1(Object... ia){
		System.out.println(" Object param");

		for (int i=0;i<ia.length ;i++ ){
			System.out.println((i+1)+"values are passed : '"+ ia[i]+i +"'");
		}
	}

	public static void main(String[] args) {
		VARule01 v=new VARule01();
		v.m1("aa","bb","gg");
		v.m1(452,4598,525);
	//	v.m2(1001);//CE : mismatch
		v.m1(1,"ggd",2,"gdgdg",3,4,5,6);
//		v.m1(Class... ia);
		System.out.println("Hello World!");
	}
}