package IO;
import java.io.*;
public class Temp2 {
	public static void main(String[] ss) throws IOException{
		 FileOutputStream fout = new FileOutputStream("abc2.txt");
		 PrintStream ps = new PrintStream(fout);
		 System.setOut(ps);
		 System.out.println("Hello");
		 
		 PrintStream ps1 = new PrintStream(new FileOutputStream("abc1.txt"));
		 System.setErr(ps1);
		 System.err.println("hi");
		 
	}
}
