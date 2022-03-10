package bi.cons.pred.suppl;

import java.util.ArrayList;
import java.util.List;

public class Employees {

	private int id;
	private String name;
	private double sal;

	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public List<Employees> getData() {
		List<Employees> list = new ArrayList<>();
		list.add(new Employees(100, "suresh", 400000));
		list.add(new Employees(100, "suresh", 550000));
		list.add(new Employees(100, "suresh", 600000));
		list.add(new Employees(100, "suresh", 800000));
		list.add(new Employees(100, "suresh", 400000));
		list.add(new Employees(100, "suresh", 900000));
		list.add(new Employees(100, "suresh", 1100000));
		list.add(new Employees(100, "suresh", 1300000));
		list.add(new Employees(100, "suresh", 450000));
		return list;
	}

	public Employees(int id, String name, double i) {
		this.id = id;
		this.name = name;
		this.sal = i;
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}

	public void getTaxPayers() {
		getData().stream().filter(t -> t.getSal() > 500000).forEach(t -> System.out.println(t));
	}

	public static void main(String[] args) {
		Employees e = new Employees();
		e.getTaxPayers();
	}

}
