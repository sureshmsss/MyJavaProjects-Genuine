package Optional;

import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
		Customer c = new Customer("a", "a@mail", 12345);
		Customer c1 = new Customer("a", null, 54321);

		Optional<String> optName = Optional.empty();
//		System.out.println(optName.orElse("suresh"));
		System.out.println(optName);
		
		//we dont get null pointer exception because OfNullable mehtod takes care
	/*	Optional<String> optMail = Optional.ofNullable(c1.getEmail());
		System.out.println(optMail.orElse("suresh#"));
		System.out.println(optMail.map(null)
		*/
		Optional<String> optMail = Optional.ofNullable("suresh");
		System.out.println(optMail);
			//will NPException Bcoz Of() method cant handle
		/*		Optional<String> optMail2 = Optional.of(c1.getEmail());
				System.out.println(optMail2.orElse("suresh@gmial"));
		*/
	}

}
