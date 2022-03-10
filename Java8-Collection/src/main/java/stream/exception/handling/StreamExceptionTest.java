package stream.exception.handling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class StreamExceptionTest {
	// approach-2
	public static void print(String s) {
		System.out.println("method approach");
		try {
			System.out.println(Integer.parseInt(s));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// approach-2
	static Consumer<String> handleExceptionifany(Consumer<String> load) {
		return obj -> {
			try {
				load.accept(obj);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("100", "101", "102", "aa");
		/*
				List<Integer> nos = list.stream().map(Integer::parseInt).collect(Collectors.toList());
				System.out.println(nos);
				System.out.println("=============");
				list.forEach(s -> System.out.println(Integer.parseInt(s)));
				System.out.println("=============");
		*/
		/*		// Approach -1
				list.forEach(s -> {
					try {
						System.out.println(Integer.parseInt(s));
					} catch (Exception e) {
						System.out.println(e);
					}
				});
			*/
		// list.forEach(StreamExceptionTest::print);
//		list.forEach(handleExceptionifany(Integer::parseInt));
		list.forEach(handleExceptionifany(s -> System.out.println(Integer.parseInt(s))));

	}
}