package generic.classess;

import java.util.ArrayList;

class Test014 
{	
	public static  void m1(ArrayList<? extends String> al){
		
		System.out.println("ArrayList<?> al : "+al);
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap! with execution from Test011");
		ArrayList<String> al=new ArrayList<String>();
		al.add("ss");
		al.add("cc");
		al.add(null);
	//	al.add(10);// ce : no suitable method found for add(int)

	//	m1(al);
	System.out.println("al : "+al);
	}
} 
