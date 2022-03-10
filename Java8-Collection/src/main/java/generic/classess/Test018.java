package generic.classess;
import java.util.*;
class Test018
{
	public static void m1(ArrayList l){
		System.out.println("from m1()");
		l.add(10);
		l.add(10.5);
		System.out.println("from m1 l : "+l);
	}
	public static void main(String[] args) 
	{
		ArrayList<String> l=new ArrayList<String>();
		l.add("ss");
		l.add("ll");
		System.out.println("Hello World! : "+l);
		m1(l);
	}
}
