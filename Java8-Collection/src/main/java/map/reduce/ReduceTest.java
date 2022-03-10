package map.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ReduceTest {

	public static void main(String[] args) {
		List<Integer> nos = Arrays.asList(1, 2, 4, 3, 6, 5, 8, 7);

		List<String> names = Arrays.asList("suresh", "maheshuni", "mahendar", "manjula", "anjali");
		List<Customer> c = Arrays.asList(
				new Customer("a", "am", 20000),
				new Customer("c", "cm", 10000),
				new Customer("f", "fm", 30000),
				new Customer("d", "dm", 40000),
				new Customer("e", "em", 60000));
		int sum = 0;
		for (int i : nos) {
			sum = sum + i;
		}
		System.out.println(sum);

		int sum1 = nos.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);

		int redSum = nos.stream().reduce(0, (a, b) -> a + b);
		System.out.println(redSum);

		Optional<Integer> redSum1 = nos.stream().reduce(Integer::sum);
		System.out.println(redSum1.get());

		int mulSum = nos.stream().reduce(1, (a, b) -> a * b);
		System.out.println(mulSum);

		Integer maxVal = nos.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxVal);

		Integer maxVal1 = nos.stream().reduce(Integer::max).get();
		System.out.println(maxVal);

		String longestname = names.stream().reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
				.get();
		System.out.println(longestname);

		Customer highSal = c.stream().reduce((sal1, sal2) -> sal1.getSal() > sal2.getSal() ? sal1 : sal2).get();
		System.out.println(highSal.getSal());
		
		double name=c.stream().filter(customer->customer.getName()
				.equals("a")).map(customer->customer.getSal())
				.mapToDouble(i->i)
				.average().getAsDouble();
		System.out.println(name);
		double name1=c.stream().filter(customer->customer.getName()
				.equals("a")).map(customer->customer.getSal())
				.mapToDouble(i->i)
				.sum();
		System.out.println(name1);
		

	}

}
