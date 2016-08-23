package IO; 
import java.util.*;
import java.io.*;
public class SInput {
	public static void main(String[] ss) throws IOException{
		//SequenceInputStream sin = new SequenceInputStream(new FileInputStream("chachi.txt"),new FileInputStream("chacha.txt"));
		
		SequenceInputStream sin = new SequenceInputStream(new MyEnum());

		DataInputStream din = new DataInputStream(sin);
		String s ="";
		while(s != null){
			s = din.readLine();
			if(s!=null){
				System.out.println(s);
			}		
		}
		din.close();
	}
}

class MyEnum implements Enumeration{
	InputStream in[];
	int i=0;
	MyEnum()
	{
		try
		{
			in = new InputStream[]{new FileInputStream("chacha.txt"),new FileInputStream("chachi.txt"),new FileInputStream("abc.txt")};
		}
		catch(Exception e){}
	}
	public boolean hasMoreElements(){
		if(i<3)
			return true;
		else 
			return false;
	}
	public Object nextElement(){
		return in[i++];
	}
	 
} 
