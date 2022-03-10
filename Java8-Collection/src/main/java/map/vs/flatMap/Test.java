package map.vs.flatMap;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapDb c = new MapDb();
		List<Customer> list = c.getAll();

		List<String> email = list.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
		System.out.println(email);

		List<List<String>> phs = list.stream().map(ph -> ph.getPh()).toList();
		System.out.println(phs);

		List<String> names = list.stream().map(name -> name.getName()).toList();
		System.out.println(names);

		List<Integer> ids = list.stream().map(id -> id.getId()).toList();
		System.out.println(ids);
		
		//flattering ==> means stream of streams mapping
		List<String> phones = list.stream().flatMap(ph -> ph.getPh().stream()).toList();
		System.out.println(phones);

	}

}
