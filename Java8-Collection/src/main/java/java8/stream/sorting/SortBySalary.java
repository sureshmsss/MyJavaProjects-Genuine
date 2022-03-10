package java8.stream.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class SortBySalary {

	public List<Employee> getEmployee() {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(109, "A", 5000));
		list.add(new Employee(102, "G", 9000));
		list.add(new Employee(105, "D", 3000));
		list.add(new Employee(101, "E", 10000));
		list.add(new Employee(103, "B", 6000));
		list.add(new Employee(100, "F", 4000));
		list.add(new Employee(108, "C", 6000));
		list.add(new Employee(102, "H", 7000));
		return list;
	}
	/*
	 * public void getBySal() { List list = getEmployee(); Collections.sort(list,
	 * new MyComp()); System.out.println(list); }
	 */

	public void getBySal() {
		List<Employee> list = getEmployee();
	/*	Collections.sort(list, (o1,o2)->(int)(o2.getSal()-o1.getSal()));
		System.out.println(list);
*/
		list.stream().sorted((o1,o2)->(int)(o1.getSal()-o2.getSal())).forEach(s->System.out.println(s));
		System.out.println("========================");
		list.stream().sorted((o1,o2)->(int)(o2.getSal()-o1.getSal())).forEach(System.out::println);
		System.out.println("=========================");
		list.stream().sorted(Comparator.comparing(s->s.getSal())).forEach(System.out::println);
		System.out.println("=============method ref id============");
		list.stream().sorted(Comparator.comparing(Employee::getId)).forEach(System.out::println);
		System.out.println("=============method ref name============");
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		System.out.println("=============method ref sal============");
		list.stream().sorted(Comparator.comparing(Employee::getSal)).forEach(System.out::println);
		
	/*	Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return (int) (o2.getSal()-o1.getSal());
			}
		});
		System.out.println(list);

	}
*/
	}
			public static void main(String[] args) {
		new SortBySalary().getBySal();

	}

}

class MyComp implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o2.getSal() - o1.getSal());
	}
}
