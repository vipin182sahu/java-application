package IO;
import java.io.*;
public class MyFileWriter {
	public static void main(String[] ss) throws IOException{
		FileOutputStream fw = new FileOutputStream(new File("E:\\Drive-D\\study\\Java Lectures\\CoreJava\\8August\\IO\\hello.txt"));
		String s = "hello my brother";
		byte ch[] = s.getBytes();
		for( int i = 0; i<ch.length; i++)
			fw.write(ch[i]);
			fw.close();
			System.out.println("file created successfully");
		
	}
}
