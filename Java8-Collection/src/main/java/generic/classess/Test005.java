package generic.classess;
class Test005 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Generics<String> ge1=new Generics<String>("durga");
		ge1.show();
		System.out.println("ge1.get() : "+ge1.get());
		Generics<Integer> ge2=new Generics<Integer>(120);
		ge2.show();
		System.out.println("ge2.get() : "+ge2.get());
		Generics<String> ge3=new Generics<String>();
		Generics<Integer> ge4=new Generics<Integer>();

	}
}
