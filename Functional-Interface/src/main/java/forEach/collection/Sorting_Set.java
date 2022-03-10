package forEach.collection;

import java.util.Set;
import java.util.TreeSet;

public class Sorting_Set {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("abecdc");
		set.add("aedbcb");
		set.add("cadbce");
		set.add("ecadbc");
		set.add("cdeadb");
		set.add("dbcdae");
		set.add("ebcdad");
		set.add("becdad");
		set.add("brcdcb");
		set.add("baebce");
		set.add("daebde");

		System.out.println("1\n");
		set.stream().sorted().forEach(System.out::println);
		System.out.println("2\n");
		set.stream().sorted().filter(t -> t.startsWith("a")).forEach(System.out::println);
		System.out.println("3\n");
		set.stream().sorted((t1, t2) -> t1.compareTo(t2)).forEach(System.out::println);
		System.out.println("4\n");
		set.stream().sorted((t1, t2) -> t1.compareTo(t2)).filter(u -> u.contains("da")).forEach(System.out::println);

	}
}
