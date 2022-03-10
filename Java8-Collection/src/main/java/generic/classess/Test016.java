package generic.classess;
import java.util.*;
class Test160{
public Test160(){
	System.out.println("Test 160 0-param ");
}
}
class Test16 extends Test160
{
	public Test16(){
		System.out.println("Test15 0-param Constructor");
	}
}

class  Test016
{
	public static  void m1(ArrayList<? super Test16> al){
		Test16 t1=new Test16();
		Test160 t2=new Test160();
		al.add(t1);
		al.add(null);
	//	al.add((Test16)t2);//no ce, no re against to generic rules
		
		System.out.println("ArrayList<?> al : "+al);
	}
	public static void main(String[] args) 
	{
		System.out.println("HashMap! with execution from Test011");
		ArrayList al=new ArrayList();
		m1(new ArrayList());
	}
} 
