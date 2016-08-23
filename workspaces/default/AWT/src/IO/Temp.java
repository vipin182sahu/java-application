package IO;
import java.io.*;

public class Temp {
	public static void main(String[] ss)throws IOException{
		FileOutputStream fout = new FileOutputStream("abc.txt");
		PrintStream ps = new PrintStream(fout);
		ps.println("hello");
		ps.println("hi");
	}
}
