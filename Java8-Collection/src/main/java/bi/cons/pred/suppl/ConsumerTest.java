package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest{// implements Consumer<String> {
/*	@Override
	public void accept(String t) {
		System.out.println(t);
	}
	
	//should execute from main by implemnting from Consumer
	 
	 ConsumerTest consumer=new ConsumerTest();
	 consumer.accept("suresh");
	  
*/
	public static void main(String[] args) {
		
		
	/*	Consumer<String> consumer = t->System.out.println("names is : "+t);
		consumer.accept("suresh");
		*/
		Consumer<Integer> con=t->System.out.println(t);
		List<Integer> list=Arrays.asList(4,5,6,7,1,2,3);
		list.stream().forEach(con);
		
		
		
	}

}
