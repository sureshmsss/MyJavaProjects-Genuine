package forEach.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map_VS_FlatMap {
	public static void main(String[] args) {

		List<Person> list = Person.personList();

		// List<person> to List<String> -> Data Transformation
		// mapping : person -> person.getName()
		// person -> person.getName() one to one mapping
		List<String> names = list.stream().map(person -> person.getName()).toList();
		List<String> names1 = list.stream().map(person -> person.getName()).collect(Collectors.toList());
		System.out.println(names + "========== " + names1);

		// List<person> to List<Integer>-> data transformation
		// mapping : person->person.getNos() -> one to many mapping
		List<List<Integer>> nos = list.stream().map(person -> person.getNos()).toList();
		List<List<Integer>> nos1 = list.stream().map(person -> person.getNos()).collect(Collectors.toList());
		System.out.println(nos + "===" + nos1);

		// List<person> to List<Integer> -> data flattering
		// mapping : person -> person.getNos() -> one to many mapping
		List<Integer> mob_s = list.stream().flatMap(person -> person.getNos().stream()).toList();
		System.out.println(mob_s);

	}
}

class Person {
	private String name;
	private List<Integer> nos;

	public Person(String name, List<Integer> nos) {
		this.name = name;
		this.nos = nos;
	}

	public static List<Person> personList() {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("sai", Arrays.asList(123, 321)));
		personList.add(new Person("suresh", Arrays.asList(234, 432)));
		personList.add(new Person("raghu", Arrays.asList(345, 543)));
		personList.add(new Person("mahi", Arrays.asList(456, 654)));
		personList.add(new Person("mahi", Arrays.asList(567, 765)));
		return personList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getNos() {
		return nos;
	}

	public void setNos(List<Integer> nos) {
		this.nos = nos;
	}

}
