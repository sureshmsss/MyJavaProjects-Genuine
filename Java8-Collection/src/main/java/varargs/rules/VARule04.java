package varargs.rules;
class  VARule04{

	//Rule#4 : How many dots are allowed with diemensions, and
	//with how many types of syntaxes are coming in that combination
	void m1(int... ia){}
	//void m1(int...... ia){}//CE
	void m1(int[]... ia){}
	void m1(int[][]... ia){}

	//void m1(int...[] ia){}//CE
	//void m1(int[]...[] ia){}//CE

	//void m1(int[]ia[]){}//CE
	//void m1(int[]ia...){}//CE

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
