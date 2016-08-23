package IO;
import java.io.*;
public class MyFileReader {
	public static void main(String[] ss) throws IOException{
		FileInputStream fr = new FileInputStream("hello.txt");
		int i = 0;
		while((i = fr.read())!= -1){
			System.out.println(i);
			i++;
		}
		fr.close();
	}
}
