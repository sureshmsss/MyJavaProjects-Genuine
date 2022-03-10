package generic.classess;
import java.util.*;

class Test020
{
	public void m1(ArrayList<String> l){//==>m1(AL l){}
		System.out.println("ArrayList<String> l");
	}
	public void m2(ArrayList<String> l){//==>m1(AL l){}
		System.out.println("ArrayList<Integer> l");
	}
	//ce :name clash: m1(ArrayList<Integer>) and m1(ArrayList<String>) have the same erasure
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
