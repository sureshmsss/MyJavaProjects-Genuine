package generic.classess;
class Test008<T extends Number> {
//class Test008<T extends  Runnable> {
//class Test008<T extends Runnable & Comparable>{	
//class Test008<T extends Number & Runnable & Comparable> {
	//class Test008<T extends Runnable & Number>{}//ce : first class followed by interface next
//class Test008<T extends Number & Thread> { }//ce : we cant wxtend more than one class simultaneously
//class Test008<T extends Number>{
//	class Test008<T implements Runnable>{//ce : we cant use implements keyword
	public static void main(String[] args) {
		System.out.println("hello gener");
}
}
