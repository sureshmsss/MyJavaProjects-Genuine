package other.classess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Try_W_R implements AutoCloseable {
	@Override
	public void close() throws Exception {
		System.out.println("close method");
	}
 
	public static void main(String[] args) throws IOException {
		// try(String s1="hi");{}
		/*
		 * try(PrintStream ps=new PrintStream(System.out)){ ps.println("hi");
		 */

		/*
		 * try(PrintStream ps=new PrintStream(System.out)){
		 * System.out.println("l;h"); }
		 */

		/*
		 * try(PrintStream ps=null){ System.out.println("l;h"); }
		 */
		/*
		 * try(new PrintStream(System.out)){ System.out.println("l;h");
		 */
		try (FileInputStream ps = new FileInputStream("dd.txt");) {
			System.out.println("hello");
		} catch (FileNotFoundException e) {
			System.out.println("filenotfound");

		} catch (IOException e) {
			System.out.println("IOException");

		}
	}

}
