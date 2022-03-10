package other.classess;

public class Eh_02 {
	public static void main(String[] args) {
		for (int i = 5; i < 6; i--) {
			try {
				System.out.println("from inner try of an outer trycatch");
				System.exit(0);
				/*
				 * if (i >= 5) { // break; // continue; }
				 */ } finally {
				System.out.println("ex");
			}

		}
	}
}