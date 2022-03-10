package j8.com.it.switchTest;

public class PatternMatchingTest {
static void show(Object o) {
	if(o instanceof String) {
		String s1=(String)o;
		String s2=s1.toUpperCase();
		System.out.println(s2);
	}
}
	public static void main(String[] args) {
		show("suresh");
		show("ssms");
	}

}
