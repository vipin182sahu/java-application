package IO;

import java.io.*;

public class Temp4 {
	public static void main(String[] ss) throws IOException {
		FileOutputStream fout = new FileOutputStream("ps.txt");
		PrintStream ps = new PrintStream(fout);
		ps.println("hello");
		ps.println("hay");
		System.out.println("file creaated");
	}
}
