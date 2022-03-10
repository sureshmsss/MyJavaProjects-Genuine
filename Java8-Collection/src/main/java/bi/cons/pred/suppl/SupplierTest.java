package bi.cons.pred.suppl;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {//implements Supplier<String>{
/*
	@Override
	public String get() {
			return "hello suresh";
	}
	//execute from main method by implementing Supplier
	SupplierTest test=new SupplierTest();
	System.out.println(test.get());
*/
	public static void main(String[] args) {
		Supplier<String> sup=()-> "hi suresh";
	//	System.out.println(sup.get());
		List<String> list=Arrays.asList("m","s","k");
		System.out.println(list.stream().findAny().orElseGet(sup));
	}

}
