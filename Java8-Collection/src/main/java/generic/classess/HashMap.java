package generic.classess;
import java.util.*;
class HashMap<k,v> 
{
	public static  void m1(ArrayList<String> al){
		al.add("s");
		al.add("t");
		al.add(null);
	//	al.add(10);// ce : no suitable method found for add(int)
		System.out.println("ArrayList<String> al : "+al);
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap!");
		ArrayList<String> al=new ArrayList<String>();
		m1(al);
	}
}
