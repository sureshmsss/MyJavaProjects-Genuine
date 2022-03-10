package fundamental.classess;

import java.util.Arrays;

public class CM01 {
	@Override
	public String toString() {
		return super.toString();
	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1 };
		int[] b = { 2, 2, 2, 2 };
		int[] c = { 3, 3, 3, 3 };
		int[] d = { 4, 4, 4, 4 };
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(java.util.Arrays.toString(d));
		for (int i = 0; i < 4; i++) {
			System.out.print(a[i] + " " + b[i] + " " + c[i] + " " + d[i]);
			System.out.println();
		}
	}
}
