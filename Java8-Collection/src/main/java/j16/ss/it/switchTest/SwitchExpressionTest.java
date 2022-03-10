package j16.ss.it.switchTest;

public class SwitchExpressionTest {
	public static void setAnimal(String string) {
		switch (string) {
		case "dog" -> {
			System.out.println("friendly animal");
		}
		default -> {
			throw new IllegalArgumentException("Unexpected value: " + string);
		}
		}
	}
	public static void main(String[] args) {

		setAnimal("dog");
		setAnimal("dhog");
	}

}
