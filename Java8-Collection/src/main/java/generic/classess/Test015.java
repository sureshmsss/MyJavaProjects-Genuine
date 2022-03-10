package generic.classess;
import java.util.*;
class Test15
{
	public Test15(){
		System.out.println("Test15 0-param Constructor");
	}
}

class  Test015
{
	public static  void m1(ArrayList<? extends Test15> al){
		
		System.out.println("ArrayList<?> al : "+al);
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap! with execution from Test011");
		ArrayList<Test15> al=new ArrayList<Test15>();
		Test15 t1=new Test15();
		al.add(t1);
	//	al.add("cc");//ce :  no suitable method found for add(String)
		al.add(null);
	//	al.add(10);// ce : no suitable method found for add(int)

		m1(al);
	System.out.println("al : "+al);
	}
} 
