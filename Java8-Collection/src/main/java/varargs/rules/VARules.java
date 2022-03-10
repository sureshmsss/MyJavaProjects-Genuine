package varargs.rules;
class VARules{
	//Rule#1 : Var arg is a parameter not a variable
	//int... i1;//CE : c f s

	void m2(int... ia){
		System.out.println("int va ");
	}
	void m2(String... ia){}
	public static void main(String[] args) {
		VARules v=new VARules();

		v.m2(4);
		
		System.out.println("Hello World!");
	}
}
