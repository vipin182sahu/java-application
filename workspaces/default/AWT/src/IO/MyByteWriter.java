package IO;
import java.io.*;
public class MyByteWriter {
	public static void main(String[] ss) throws IOException{
		ByteArrayOutputStream fw = new ByteArrayOutputStream();
		String s = "hello";
		byte ch[] = s.getBytes();
		for(int i=0; i<ch.length; i++){
			fw.write(ch[i]);
			fw.writeTo(new FileOutputStream("raberi.txt"));
			//System.out.println(fw.toString());
			byte[] z = fw.toByteArray();
			ByteArrayInputStream fr = new ByteArrayInputStream(z);
			int i1 = 0;
			while((i1 = fr.read())!= -1 ){
				System.out.println((char)i1);
			}
		}
	}
}
