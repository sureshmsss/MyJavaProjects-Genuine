package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest{// implements Predicate<Integer>{
/*	@Override
	public boolean test(Integer t) {
		if(t%2==0)
			return true;
		else
			return false;
	}
	//execute from main by implementing Predicate
	PredicateTest p=new PredicateTest();
	System.out.println(p.test(10));
*/
	
	public static void main(String[] args) {
	/*	Predicate<Integer> p=t->{
			if(t%2==0) 
				return true;
			else
				return false;
			};
		System.out.println(p.test(4));
		System.out.println(p.test(3));*/
		
		Predicate<Integer> p=t->t%2==0;
		
		List<Integer> l=Arrays.asList(1,2,3,8,9);
		
		l.stream().filter(t->t%2==0).forEach(t->System.out.println("print even :"+t));
	}

}
