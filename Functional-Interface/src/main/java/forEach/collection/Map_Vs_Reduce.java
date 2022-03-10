package forEach.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Map_Vs_Reduce {

	public static void main(String[] args) {

		List<Integer> nos = Arrays.asList(3, 2, 6, 4, 8, 9, 7, 5, 1);
		List<String> names = Arrays.asList("suresh", "mahendar", "suri", "manjula", "anjali");
		int sum = 0;
		for (Integer no : nos) {
			sum = sum + no;
		}
		System.out.println(sum);

		Integer no1 = nos.stream().mapToInt(a -> a).sum();
		System.out.println(no1);

		Integer no2 = nos.stream().reduce(0, (a, b) -> a + b);
		System.out.println(no2);

		Optional<Integer> reduceSumMethodRef = nos.stream().reduce(Integer::sum);
		System.out.println(reduceSumMethodRef.get());

		Integer no3 = nos.stream().reduce(1, (a, b) -> a * b);
		System.out.println(no3);

		Integer no4 = nos.stream().reduce(1, (a, b) -> a > b ? a : b);
		System.out.println(no4);

		String name = names.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).get();
		System.out.println(name);

		List<Student> students = new ArrayList<Student>();
		students.add(new Student("a", 95));
		students.add(new Student("b", 85));
		students.add(new Student("c", 75));
		students.add(new Student("d", 65));
		students.add(new Student("e", 55));

		Double marks = students.stream().filter(t -> t.getMarks() >= 75).map(u -> u.getMarks()).mapToDouble(i -> i)
				.average().getAsDouble();

		System.out.println(marks);
		Double sum1 = students.stream().filter(t -> t.getMarks() >= 75).map(u -> u.getMarks()).mapToDouble(i -> i)
				.sum();

		System.out.println(sum1);
	}
}
