package forEach.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sorting_List {

	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("d", 95));
		students.add(new Student("a", 85));
		students.add(new Student("c", 75));
		students.add(new Student("b", 55));
		students.add(new Student("e", 65));
		return students;
	}

	public static void main(String[] args) {
		List<String> alphas = new ArrayList<String>();
		alphas.add("abecdc");
		alphas.add("aedbcb");
		alphas.add("cadbce");
		alphas.add("ecadbc");
		alphas.add("cdeadb");
		alphas.add("dbcdae");
		alphas.add("ebcdad");
		alphas.add("becdad");
		alphas.add("brcdcb");
		alphas.add("baebce");
		alphas.add("daebde");

		Collections.sort(alphas);
		System.out.println(alphas);
		Collections.reverse(alphas);
		System.out.println(alphas);
		System.out.println("============");
		System.out.println("\n");
		alphas.stream().sorted().forEach(s -> {
			System.out.print(s);
			System.out.print(",");
		});
		System.out.println("\n");
		alphas.stream().sorted(Comparator.reverseOrder()).forEach(s -> {
			System.out.print(s);
			System.out.print(",");
		});
		System.out.println("\n");
		alphas.stream().filter(t -> t.startsWith("a")).forEach(s -> {
			System.out.print(s);
			System.out.print(",");
		});
		System.out.println("\n");
		alphas.stream().sorted().filter(t -> t.startsWith("a")).forEach(s -> {
			System.out.print(s);
			System.out.print(",");
		});
		System.out.println("\n");
		System.out.println("=============");
		List<Student> list = getStudents();
		System.out.println("=============");

		// version-1--by Specified Class implemented by Comparator(I)
		System.out.println("version-1 \n");
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		// version-2--by directly implementing anonymous Comparator(I)
		System.out.println("version-2 \n");
		Collections.sort(list, new Comparator<Student>() {
			public int compare(Student o1, Student o2) {
				return o1.getMarks() - o2.getMarks();
			}
		});
		System.out.println(list);
		// version-2--by directly implementing anonymous Comparator(I)
		System.out.println("version-3 \n");
		Collections.sort(list, (o1, o2) -> o1.getMarks() - o2.getMarks());
		System.out.println(list);
		System.out.println(list);

		// version-4--by directly traditional approach
		System.out.println("version-4 \n");
		list.stream().sorted((t1, t2) -> t1.getMarks() - t2.getMarks()).forEach(t -> System.out.println(t));
		// version-5 by using method reference
		System.out.println("version-5 \n");
		list.stream().sorted((t1, t2) -> t1.getMarks() - t2.getMarks()).forEach(System.out::println);
		System.out.println(list);

		// version-6 by using method reference
		System.out.println("version-6 \n");
		list.stream().sorted(Comparator.comparing(t -> t.getMarks())).forEach(System.out::println);
		// version-7 by using method reference
		System.out.println("version-7 \n");
		list.stream().sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);
		System.out.println("\n");
		list.stream().sorted(Comparator.comparing(Student::getMarks)).forEach(System.out::println);

	}

}

class MyComparator implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		// return o1.getMarks().compareTo(o2.getMarks());// marks ascending order
		// return o1.getMarks() - o2.getMarks();//marks descending order
		return o1.getName().compareTo(o2.getName());// name ascending order
		// return o2.getName().compareTo(o1.getName());// name descending order
	}
}