package string.methods;
//appending new String data or characters to the String buffer
//public StringBuffer append(xxx val)
//to insert new String characters 
//public StringBuffer insert(int index,xxx val)
//to replce existing string characters at a sequence of characters 
//public StringBuffer setCharAt(int index,char ch)
//delete character or sequence of characters
//public StringBuffer deleteCharAt(int index);
//public StringBuffer delete(int start,int end)
public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("surehs");
		System.out.println(sb1.insert(2, "k"));
		System.out.println(sb1.insert(2, 'c'));//
		System.out.println("==========");
		sb1.setCharAt(3, 'e');
		System.out.println(sb1);
		sb1.setCharAt(3, 'k');//
		System.out.println(sb1);
		System.out.println("===========");
		System.out.println(sb1.delete(0, 1));//
	//	System.out.println(sb1);
		System.out.println(sb1.deleteCharAt(2));//
		System.out.println(sb1.append("JAVA"));//

	}

}
