package IO;
import java.io.*;
public class Temo3 {
	public static void main(String[] ss) throws IOException{
		FileInputStream fin = new FileInputStream("abc3.txt");
		InputStream in = new InputStream(fin);
		int x = System.in("hello");
		System.out.println("x");
	}
}
