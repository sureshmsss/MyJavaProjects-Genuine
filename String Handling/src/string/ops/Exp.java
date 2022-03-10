package string.ops;

public final class Exp {
	private final int a;

	private Exp(int a) {
		this.a = a;
	}

	public int getA() {
		return this.a;
	}
/*	public <T> setA(int a) {
		if(this.a==a) {
			this.a=this.a;
		}
		return new Class<T>(null, null);//this.a=a
	}
*/
	@Override
	public String toString() {
		return "Exp =>a=" + a;
	}

	public static void main(String[] args) {

		Exp e1 = new Exp(10);
		System.out.println(e1.toString());
		Exp e2 = new Exp(11);
		System.out.println(e2.toString());

	}

}
