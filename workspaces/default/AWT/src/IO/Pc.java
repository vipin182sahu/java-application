package IO;
import java.io.*;
public class Pc {
	public static void main(String[] ss) throws FileNotFoundException{
		FileOutputStream fout = new FileOutputStream("chachi.txt");
		PrintStream ps = new PrintStream(fout);
		FileOutputStream fout1 = new FileOutputStream("chacha.txt");
		PrintStream ps1 = new PrintStream(fout1);
		
		System.setOut(ps);
		System.setErr(ps1);
		
		System.out.println("chachi 420");
		System.err.println("chacha 840");
		System.err.println("chacha hi");
		System.out.println("chachi 420");
	}
}
