package map.reduce;

public class Customer {
	private String name;
	private String email;
	private double sal;

	public Customer(String name, String email, double sal) {
		super();
		this.name = name;
		this.email = email;
		this.sal = sal;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public double getSal() {
		return sal;
	}

}
