package parallel.stream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamTest {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		long start, end;
		/*		start = System.currentTimeMillis();
		IntStream.range(1, 100).forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("plain " + (end - start));
		System.out.println("====================================");
		start = System.currentTimeMillis();
		IntStream.range(1, 100).parallel().forEach(System.out::println);
		end = System.currentTimeMillis();
		System.out.println("parallel " + (end - start));
		
		
		
		IntStream.range(1, 10).forEach(x -> {
			System.out.println("plain : " + Thread.currentThread().getName() + " " + x);
		});
		System.out.println("=============================================");
		IntStream.range(1, 10).parallel().forEach(x -> {
			System.out.println("plain : " + Thread.currentThread().getName() + " " + x);
		});
*/
		List<Student> list = StudentDb.getAll();
		start = System.currentTimeMillis();
		double val = list.stream().map(Student::getId).mapToInt(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("plain " + (end - start));
		System.out.println("=====================================");
		start = System.currentTimeMillis();
		double val1 = list.parallelStream().map(Student::getId).mapToInt(i -> i).average().getAsDouble();
		end = System.currentTimeMillis();
		System.out.println("parallel " + (end - start));

	}

}
