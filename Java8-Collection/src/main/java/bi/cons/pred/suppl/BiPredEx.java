package bi.cons.pred.suppl;

import java.util.function.BiPredicate;

public class BiPredEx implements BiPredicate<String, String> {
	@Override
	public boolean test(String t1, String t2) {
		return t1.equals(t2);
	}

	public static void main(String[] args) {
		BiPredicate<String, String> bp1 = new BiPredEx();
		System.out.println("traditional : " + bp1.test("suresh", "suresh"));

		System.out.println("============");

		BiPredicate<String, String> bp2 = new BiPredicate<String, String>() {

			@Override
			public boolean test(String t, String u) {
				return t.equals(u);
			}
		};
		System.out.println("anonymous app : " + bp2.test("ssms", "ssms"));
		System.out.println("=============");
		BiPredicate<String, String> bp3 = (t, u) -> t.equals(u);
		System.out.println("lambda app : " + bp3.test("suresh", "suresh"));
		System.out.println("===========");
		BiPredicate<String, String> bp4 = (t1, t2) -> t1.length() == t2.length();
		boolean res = bp4.and(bp3).test("ss", "ss");
		System.out.println("res : " + res);
		System.out.println("========");
		boolean res1 = bp4.or(bp3).test("ss", "as");
		System.out.println("res1 : " + res1);

	}

}
