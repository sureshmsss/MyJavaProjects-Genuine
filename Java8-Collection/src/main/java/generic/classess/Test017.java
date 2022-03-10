package generic.classess;
import java.util.*;
class Test170
{
}
class Test17 extends Test170
{
}
class Test017 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		ArrayList<String> l1=new ArrayList<String>();
		ArrayList<?> l2=new ArrayList<String>();
		ArrayList<?> l3=new ArrayList<Integer>();

		//	ArrayList<?> l4=new ArrayList<?>();// ce :
		//error:unexpected type  required:class or interface without bounds found:?

		//	ArrayList<?> l5=new ArrayList<? extends Number>();//ce
		//error: unexpected type  required:class or interface without bounds  found: ? extends Number

		ArrayList<? extends Number> l5=new ArrayList<Integer>();

		//	ArrayList<? extends Number> l6=new ArrayList<String>();//ce :
		//: error: incompatible types: ArrayList<String> cannot be converted to ArrayList<? extends Number>

		ArrayList<? super String> l7=new ArrayList<Object>();

		ArrayList<? super Test17> l8=new ArrayList<Test170>();

		//	ArrayList<?> l9=new ArrayList<? extends Number>();// ce:
		// unexpected type required:class or interface without bounds  found:? extends Number

		// ArrayList<Object> l10=new ArrayList<String>();//ce : incompatible types

		ArrayList<? super Integer> l11=new ArrayList<Number>();


	}
}
