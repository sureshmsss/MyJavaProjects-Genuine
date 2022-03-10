package forEach.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ForEach_with_Stream {

	public Object send(Integer marks) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("a", 95));
		students.add(new Student("b", 85));
		students.add(new Student("c", 75));
		students.add(new Student("d", 65));
		students.add(new Student("e", 55));
		// version -1
		/*		if (marks >= 75) {
			return students.stream().filter(t -> t.getMarks() >= 75).collect(Collectors.toList());
		} else {
			return students.stream().filter(t -> t.getMarks() < 75).collect(Collectors.toList());
		}*/

		// version-2
		return (marks >= 75) ? students.stream().filter(t -> t.getMarks() >= 75).collect(Collectors.toList())
				: students.stream().filter(t -> t.getMarks() < 75).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		/*	List<String> alphas = new ArrayList<String>();
			alphas.add("abc");
			alphas.add("abb");
			alphas.add("cbc");
			alphas.add("ddd");
			alphas.add("acce");
			List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
			
			alphas.stream().forEach(t -> {System.out.print(t);System.out.print(",");});
			System.out.println();
			System.out.println("\n");
			alphas.forEach(t ->{ System.out.print(t);System.out.print(",");});
			System.out.println("\n");
			Map<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "a");
			map.put(2, "b");
			map.put(3, "c");
			map.put(4, "d");
			map.put(5, "e");
			map.put(6, "f");
		
			map.forEach((t, u) -> System.out.println(t + "=>" + u));
			System.out.println("\n");
			map.entrySet().stream().forEach((u)->System.out.println(u));
			System.out.println("\n");
			Consumer<String> consumer=(t)->System.out.print(t);
			for(String s1:alphas) {
				consumer.accept(s1);
			}
			System.out.println("\n");
			
				for(Integer i:numbers) {
				System.out.print(i);
			}
			System.out.println("\n");
		
		List<String> alphas1 = new ArrayList<String>();
		alphas1.add("abc");
		alphas1.add("abb");
		alphas1.add("cbc");
		alphas1.add("ddd");
		alphas1.add("acce");
		
		for (String s1 : alphas1) {
			if (s1.startsWith("a")) {
				System.out.println(s1);
			}
		}
		System.out.println("\n");
		alphas1.stream().filter(t -> t.startsWith("a")).forEach(s -> System.out.println(s));
		
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "a");
		map1.put(2, "b");
		map1.put(3, "c");
		map1.put(4, "d");
		map1.put(5, "e");
		map1.put(6, "f");
		
		map1.entrySet().stream().filter(k -> k.getKey() % 2 == 0).forEach(s -> System.out.println(s));
		
		
		students.stream().forEach(s -> System.out.println(s));
		System.out.println("\n");
		students.stream().filter(t -> t.getMarks() > 75).forEach(s -> System.out.println(s));
		
		
		*/
		ForEach_with_Stream fis = new ForEach_with_Stream();
		System.out.println(fis.send(75));

	}

}

class Student {
	private String name;
	private Integer marks;

	public Student(String name, Integer marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return " \nStudent=>" + name + "-" + marks;
	}

}