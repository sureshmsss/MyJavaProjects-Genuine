package varargs.rules;
class  VARule09{

	//Rule#9 : this var arg parameter not only stricts for single data type
	//it allows all the primitive types,
	//from those primitives if value matching is unavailable then
	//method call hierarchy will gets and executes it self

	static void m1(int... a){
	System.out.println("int param");
	}
	static void m1(float... a){
		System.out.println("float param");
}
	static void m1(long... a){
		System.out.println("long param");
}


	public static void main(String[] args) {
		m1(45,96,55);

		m1(45l,96,55);
		m1(45,96l,55);
		m1(45,96,55l);
		
		m1(45,96,55f);
		m1(45l,96,55f);
	//	m1(45f,96l,55d);
		System.out.println("Hello World!");
	}
}
