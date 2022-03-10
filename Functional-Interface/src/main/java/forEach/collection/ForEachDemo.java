package forEach.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args) {
		System.out.println("===========");
		//sorting the names by starting with string
		List<String> list = new ArrayList<>();
		list.add("radha");
		list.add("shankaraiah");
		list.add("harshika");
		list.add("srihan");
		list.add("mahendar");
		list.add("deepthi");

		list.stream().filter(m -> m.startsWith("s")).forEach(n -> System.out.println(n));
		System.out.println("===========");
		//sorting the items of map by even 

		Map<Integer, String> map = new HashMap();

		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(5, "e");

		map.entrySet().stream().filter(m -> m.getKey() % 2 == 0).forEach(n -> System.out.println(n));
	}

}
