package j8.com.it.switchTest;

public class SwitchExpressionTest2 {
	public static void setAnimal(String string) {
		String s = switch (string) {
		case "dog" -> "friendly animal";
		case "cow" -> "domestic animal";
		default -> "Unexpected value: " + string;		
		};
		System.out.println(s);
	}

	public static void main(String[] args) {
		System.out.println("=======");
		setAnimal("dog");
		setAnimal("cow");
		System.out.println("=======");

		String s = switch (args[0]) {
		case "yellow" -> "turmeric";
		case "green" -> "leaf";
		case "red" -> "blood";
		case "white" -> "peace";
		default -> "Unexpected value: " + args[0];
		};
		System.out.println(s);
	}

}
