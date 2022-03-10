package parallel.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentDb {
	public static List<Student> getAll() {

		List<Student> s = new ArrayList<Student>();
		for (int i = 100; i <= 200; i++) {
			s.add(new Student(i, "a" + i, "add" + i));
		}
		return s;
	}

}
