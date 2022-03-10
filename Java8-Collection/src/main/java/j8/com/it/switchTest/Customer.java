package j8.com.it.switchTest;

public class Customer {
	private int id;
	private String name;
	private double bill;

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

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", bill=" + bill + "]";
	}

}
