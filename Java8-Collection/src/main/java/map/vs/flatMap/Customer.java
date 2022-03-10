package map.vs.flatMap;

import java.util.List;

public class Customer {
	private int id;
	private String name;
	private String email;
	private List<String> ph;

	public Customer() {
		System.out.println("Customer.Customer()");
	}

	public Customer(int id, String name, String email, List<String> ph) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.ph = ph;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<String> getPh() {
		return ph;
	}

}
