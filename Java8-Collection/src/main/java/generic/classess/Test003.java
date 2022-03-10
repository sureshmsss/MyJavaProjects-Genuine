package generic.classess;
import java.util.*;
class  Test003
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		List<String> l1=new ArrayList();
		List<String> l2=new ArrayList<String>();
		Collection<String> l3=new ArrayList<String>();
		//List<Object> l4=new ArrayList<String>();//CE : incompatible types: ArrayList<String> cannot be converted to List<Object>
		List<Object> l5=new ArrayList<Object>();
		// ArrayList al=new ArrayList<int>();//CE > unexpected type   required: reference but found:    int
}
}
