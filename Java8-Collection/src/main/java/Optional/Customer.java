package Optional;

import java.util.Optional;

public class Customer {
	private String name;
	private String email;
	private Integer phone;

	public Customer(String name, String email, Integer phone) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	/*	public String getEmail() {
			return email;
		}
	*/
	public Optional<String> getEmail() {
		return Optional.ofNullable(email);
	}

	public long getPhone() {
		return phone;
	}

}
