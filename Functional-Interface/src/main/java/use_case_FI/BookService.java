package use_case_FI;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Books> getsortedBooks1() {
		List<Books> list = new BooksDAO().getBooks();
		list.sort(new Mycomparator());

		return list;
	}

	public List<Books> getsortedBooks2() {
		List<Books> list = new BooksDAO().getBooks();
		Collections.sort(list, new Mycomparator());
		return list;
	}

	public List<Books> getsortedBooks3() {
		List<Books> list = new BooksDAO().getBooks();
		list.sort(new Comparator<Books>() {
			public int compare(Books o1, Books o2) {
				return o2.getName().compareTo(o1.getName());
			}// compare method

		});// sort method

		return list;
	}// method

	public List<Books> getsortedBooks4() {
		List<Books> list = new BooksDAO().getBooks();
		list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));// sort method

		return list;
	}// method

	public static void main(String[] args) {
		BookService ser = new BookService();

		Long t1 = System.currentTimeMillis();
		System.out.println(ser.getsortedBooks1());
		Long t2 = System.currentTimeMillis();
		System.out.println("time is : " + (t2 - t1));

		System.out.println("=====================");
		Long t3 = System.currentTimeMillis();
		System.out.println(ser.getsortedBooks2());
		Long t4 = System.currentTimeMillis();
		System.out.println("time is : " + (t4 - t3));

		System.out.println("======================");
		Long t5 = System.currentTimeMillis();
		System.out.println(ser.getsortedBooks3());
		Long t6 = System.currentTimeMillis();
		System.out.println("time is : " + (t6 - t5));

		System.out.println("======================");
		Long t7 = System.currentTimeMillis();
		System.out.println(ser.getsortedBooks4());
		Long t8 = System.currentTimeMillis();
		System.out.println("time is : " + (t8 - t7));
	}

}

class Mycomparator implements Comparator<Books> {

	@Override
	public int compare(Books o1, Books o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
