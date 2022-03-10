package generic.classess;
import java.util.*;
class Test011<T>
{
	public static  void m1(ArrayList<String> al){
		
		al.add("ss");
		al.add("cc");
		al.add(null);
	//	al.add(10);
		System.out.println("ArrayList<?> al : "+al);
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap! with execution from Test011");
		m1(new ArrayList<String>());
	}
} 