package java8.stream.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 101);
		map.put("e", 103);
		map.put("d", 105);
		map.put("c", 102);
		map.put("b", 104);
		
		List<Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list,new Comparator<Entry<String,Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue()-o2.getValue();
			}
			
		});
		System.out.println(list);
		for(Entry<String,Integer> entry: list) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}

	}

}
