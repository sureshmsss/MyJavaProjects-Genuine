package bi.cons.pred.suppl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import com.sun.net.httpserver.Filter;

public class FilterForEachTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("honda");
		list.add("benz");
		list.add("suzuki");
		list.add("bmw");
		list.add("hundai");
		list.add("audi");
		list.add("scoda");
		list.add("toyoto");
		list.add("ambassdor");
		list.add("hero");

		for (String s : list) {
			if (s.startsWith("a")) {
				System.out.println(s);
			}
		}
		System.out.println("-----------------------");
		list.stream().filter(t -> t.startsWith("s")).forEach(t -> System.out.println(t));

		System.out.println("-----------------");
		list.stream().forEach(t -> System.out.println(t));
		System.out.println("-----------------");

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");

	/**	map.forEach((key, value) -> System.out.println(key + "-" + value));
		System.out.println("===================================");
		map.entrySet().forEach(obj -> System.out.println(obj));
		System.out.println("===================================");
		map.entrySet().stream().forEach(obj -> System.out.println(obj));
		System.out.println("===================================");
		Consumer<String> con=t->System.out.println(t);
		con.accept("hello suresh do all the thing s in a best manner");
*/		System.out.println("=====================================");
		map.entrySet().stream().filter(k->k.getKey()%2==1).forEach(t->System.out.println(t));
		
	}

}
