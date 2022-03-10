package other.classess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Exo9 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		try (FileOutputStream fos = new FileOutputStream("abc.txt")) {
			System.out.println("from FileOutputStream");
			int a=119;
			fos.write(a);
			System.out.println("data has been stored in abc.txt");

		}
		System.out.println("------------------");
		try {
//			FileInputStream fis = new FileInputStream("F:\\HK\\Eclipse\\Exception Handling\\abc.txt");
			FileInputStream fis = new FileInputStream("abc.txt");
			System.out.println("from FileInputStream");
			int i1 = fis.read();
			System.out.println(i1);
			char c1 = (char)fis.read();
			System.out.println(c1);
		} catch (FileNotFoundException f) {
			f.printStackTrace();
		} catch (IOException f) {
			f.printStackTrace();
		}

		System.out.println("hi");
	}

}
