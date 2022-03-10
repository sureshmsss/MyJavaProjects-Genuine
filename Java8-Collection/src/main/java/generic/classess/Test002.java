package generic.classess;
import java.util.ArrayList;
class Test002 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList list=new ArrayList();
		list.add("durga");
		System.out.println("list : "+list);
		//String s=list.get(0);  //=====> Type casting
		//CE : incompatible types: Object cannot be converted to String
		//String s=(String)list.get(0); //compiles nicely 
	}
}
