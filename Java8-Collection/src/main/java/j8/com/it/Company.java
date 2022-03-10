package j8.com.it;

public class Company {
	public static void main(String[] args) {
		Finterface1 fi = (i) -> {System.out.println("from fi1 :"+i);};
		fi.data(755557);
		
		Finterface2 fi2=(i)-> {return ((i*10)-i);};
		System.out.println("from fi2 :"+fi2.data(12345));
		Finterface3 fi3=(i,j)-> {if(i>j)
			throw new IllegalArgumentException( "not valid");
		else{
			return "j is greater";
		}};
		System.out.println("from fi3 :"+fi3.data(123,45));
	}
}
