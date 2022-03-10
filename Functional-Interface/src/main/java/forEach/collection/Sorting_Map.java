package forEach.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Sorting_Map {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("b", 6);
		map.put("c", 3);
		map.put("d", 7);
		map.put("e", 4);
		map.put("f", 2);
		map.put("f", 5);
		System.out.println("traditional approach version-1");

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// return o1.getKey().compareTo(o2.getKey());
				return o2.getValue() - (o1.getValue());
			}
		});

		for (Entry<String, Integer> e : entries) {
			System.out.println(e.getKey() + "=>" + e.getValue());
		}
		System.out.println("========");
		// traditional approach version-2
		Collections.sort(entries, (o1, o2) -> o2.getValue() - o1.getValue());

		for (Entry<String, Integer> e : entries) {
			System.out.println(e.getKey() + "=>" + e.getValue());
		}

		// java 8 Stream API version -3

		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

		// traditional version-1
		Map<Student, Integer> studMap1 = new TreeMap<Student, Integer>(new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getMarks() - o2.getMarks();
			};
		});

		// java 8 stream API version-2
		// Map<Student, Integer> studMap = new TreeMap<Student, Integer>((o1, o2) ->
		// o1.getMarks() - o2.getMarks());
		// java 8 stream API version-3
	//	Map<Student, Integer> studMap = new TreeMap<Student, Integer>(
	//			(o1, o2) -> o1.getMarks().compareTo(o2.getMarks()));
		Map<Student, Integer> studMap = new TreeMap<Student, Integer>(
				(o1, o2) -> o1.getMarks().compareTo(o2.getMarks()));

		studMap.put(new Student("d", 95), 5);
		studMap.put(new Student("a", 85), 1);
		studMap.put(new Student("c", 75), 3);
		studMap.put(new Student("b", 55), 4);
		studMap.put(new Student("e", 65), 2);
		System.out.println(studMap);

		System.out.println("============");
		studMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getMarks)))
				.forEach(System.out::println);
		studMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName)))
				.forEach(System.out::println);
		System.out.println("============");
		studMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getMarks).reversed()))
				.forEach(System.out::println);
		studMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Student::getName).reversed()))
				.forEach(System.out::println);
		System.out.println("======================");
		System.out.println("======================");
		System.out.println("======================");
		studMap.entrySet().stream().sorted().forEach(System.out::println);
		System.out.println("======================");
		System.out.println("======================");
		System.out.println("======================");

		System.out.println("\n");
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("a", "k");
		map1.put("f", "d");
		List<Entry<String, String>> entries1 = new ArrayList<>(map1.entrySet());

		Collections.sort(entries1, new Comparator<Entry<String, String>>() {
			@Override
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});
		for (Entry<String, String> entry : entries1) {
			System.out.println(entry.getKey() + "=>" + entry.getValue());
		}

		System.out.println("\n");
		Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
		map3.put(1, 120);
		map3.put(2, 121);

		List<Entry<Integer, Integer>> entries3 = new ArrayList<>(map3.entrySet());

		Collections.sort(entries3, new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		System.out.println("\n");
		Map<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "120");
		map4.put(2, "121");

		List<Entry<Integer, String>> entries4 = new ArrayList<>(map4.entrySet());

		Collections.sort(entries4, new Comparator<Entry<Integer, String>>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

	}

}
