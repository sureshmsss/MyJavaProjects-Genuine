package j16.ss.it.switchTest;

public class RecordTest {

	public static void main(String[] args) {
		Employee e = new Employee(1, "a", 2000);
		System.out.println(e.id());
		System.out.println(e.name());
		System.out.println(e.salary());
	}
}