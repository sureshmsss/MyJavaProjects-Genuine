package j16.ss.it.switchTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class SwitchTest {

	public static void main(String[] args) {
		// java 8===Switch
		Stream.of(1, 2, 3, 4, 5, 6, 7, 8).filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

		Stream.of("suresh", "mahendar").map(e -> e + " maheshuni").forEach(System.out::println);
		System.out.println("=========================");

		// java 8 ====optional

		String s[] = new String[5];
		s[2] = "ssms";
		System.out.println(s[2].length());
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println(s[4]);
		System.out.println(s.length);

		Optional<String> isNull = Optional.ofNullable(s[2]);
		if (isNull.isPresent()) {
			System.out.println(s[2] + " " + s[2].length());
		} else {
			System.out.println("value if not available");
		}
		isNull.ifPresent(e -> System.out.println(e.length()));

		Optional<String> nothing = Optional.empty();
		nothing.ifPresent(e -> System.out.println("byeee......."));
		System.out.println("=========================");

		// java 9 === jShell enabling on command prompt

		// java 9=== factoryMethod for Immutableclasses
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<String> names = List.of("ss", "ms", "ssms", "mr");
		names.stream().forEach(e -> System.out.println(e));
		System.out.println("=========================");

		// java 10====var Keyword
		int x = 10;
		var x1 = 20;
		var x2 = "20";
		var h = new HashSet<String>();
		h.add("maven");
		System.out.println(x + x1);
		System.out.println(x2 + x1);
		System.out.println(h);
		System.out.println(h.hashCode());
		var h1 = new ArrayList<String>();
		h1.add("ssms");
		System.out.println(h1);
		System.out.println(h1.hashCode());
		System.out.println(h1.get(0));
		System.out.println("=========================");

		//

		// java 11

		// java 12==switch case

		/*String ssstring = null;
		ssstring = switch (ssstring) {
		case "mon", "tue", "wed", "thur", "fri" -> "working day";
		// break;
		case "sat", "sun" -> "holiday";
		// break;
		default -> "invalid day";
		};
		// System.out.println(s);
*/
		String browser ;
		browser = switch (args[0]) {
		case "ie" -> "internet explorer";
//		System.out.print("internet explorer");
		// break;
		case "ch" -> "chrome";
		// break;
		default -> "Unexpected value: ";
		};
	}
}
