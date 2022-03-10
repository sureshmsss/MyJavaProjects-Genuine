package use_case_FI;

import java.util.ArrayList;
import java.util.List;

public class BooksDAO {

	public List<Books> getBooks() {
		List<Books> list = new ArrayList<>();
		list.add(new Books(101, "cj", 450));
		list.add(new Books(102, "aj", 500));
		list.add(new Books(103, "spring", 800));
		list.add(new Books(104, "hibernate", 900));
		list.add(new Books(105, "html", 250));
		list.add(new Books(106, "oracle", 600));

		return list;
	}

}
