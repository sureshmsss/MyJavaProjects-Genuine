package fundamental.classess;

import java.util.Scanner;

public class CM03 {
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m = 2;//sc.nextInt();
		int n = 5;//sc.nextInt();
		for (int i = m; i <= n; i++) {
			for (int j = m; j ==n; m--) {
				System.out.println(i + "," + n);
			//	System.out.println("-");
			}
		}
	}
}
