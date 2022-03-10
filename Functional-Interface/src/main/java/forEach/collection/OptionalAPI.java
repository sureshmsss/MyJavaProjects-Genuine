package forEach.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalAPI {
	public static void main(String[] args) {
		Person1 person = new Person1(1010, null, "hyd");

		Optional<String> opt = Optional.empty();
		System.out.println("opt : " + opt);
		Optional<String> opt2 = Optional.of(person.getCity());
		System.out.println("opt2 : " + opt2);
		// Optional<String> opt3 = Optional.of(person.getName());//NPE pointing to NUll
		// System.out.println("opt3 : " + opt3);
		Optional<String> opt4 = Optional.ofNullable(person.getCity());
		if (opt4.isEmpty())
			System.out.println("opt4 : " + opt4);
		else
			System.out.println("Opt4 is empty");

		System.out.println(opt4.ofNullable(person.getCity()).orElse("C/O TS"));
		System.out.println(opt4.ofNullable(person.getCity()).orElseGet(() -> "C/O TS"));
		System.out.println(Person1.getPersonByName("pappy"));//available
		System.out.println(Person1.getPersonByName("xyz"));//not available
	}
}

class Person1 {
	private Integer id;
	private String name;
	private String city;

	public Person1(Integer id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public Person1() {
		// TODO Auto-generated constructor stub
	}

	public static List<Person1> personList() {
		List<Person1> personList = new ArrayList<>();
	//	personList.add(new Person1(1016, "raghu", "hyd"));
	//	personList.add(new Person1(1018, "srihan", "knr"));
	//	personList.add(new Person1(1019, "punith", "delhi"));
	//	personList.add(new Person1(1014, "pappy", "rs"));
		personList.add(new Person1(1015, null, "hyd"));
		return personList;
	}

	public static Person1 getPersonByName(String name) {
		return personList().stream().filter(person -> person.getName().equals(name)).findAny().orElse(new Person1());
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Optional<String> getName() {
		return Optional.ofNullable(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {

		return "id-" + id + ",name-" + name + ",city-" + city;
	}
}
