package forEach.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Stream_Vs_ParallelStream {

	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		/*
				start = System.currentTimeMillis();
				IntStream.range(1, 1000).forEach(t -> System.out.println());
				end = System.currentTimeMillis();
				System.out.println("plain : " + (end - start));
				start = System.currentTimeMillis();
				IntStream.range(1, 1000).parallel().forEach(t -> System.out.println());
				end = System.currentTimeMillis();
				System.out.println("plain : " + (end - start));
				*/

		IntStream.range(1, 50)
				.forEach(x -> System.out.println("thread : " + Thread.currentThread().getName() + " : " + x));
		IntStream.range(1, 50).parallel()
				.forEach(x -> System.out.println("thread : " + Thread.currentThread().getName() + " : " + x));

		List<EMp> list = new ArrayList<EMp>();
		for (int i = 0; i <= 50; i++) {
			EMp e = new EMp("a", i, i + 100);
			list.add(e);
		}

		start = System.currentTimeMillis();
		Double d1 = list.stream().map(EMp::getId).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("plain : " + (end - start)+"=> "+d1);
		start = System.currentTimeMillis();
		//Double d2 = list.stream().parallel().map(EMp::getId).mapToDouble(i -> i).average().getAsDouble();
		Double d2 = list.parallelStream().parallel().map(EMp::getId).mapToDouble(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("parallel : " + (end - start)+"=> "+d2);

		/*
				List<Integer> nos = Arrays.asList(3, 2, 6, 4, 8, 9, 7, 5, 1);
				List<String> names = Arrays.asList("suresh", "mahendar", "suri", "manjula", "anjali");
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
		*/ }
}

class EMp {
	private String name;
	private Integer id;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EMp(String name, Integer id, int i) {
		super();
		this.name = name;
		this.id = id;
		this.salary = i;
	}

	@Override
	public String toString() {
		return "EMp=>name=" + name + ", id=" + id + ", salary=" + salary;
	}

}
