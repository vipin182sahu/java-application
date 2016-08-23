package IO;
import java.io.*;

class Emp extends Base implements Serializable{
	transient int a;
	static int b;
	String name;
	int age;
	
	Emp(String name,int age,int a,int b,int z){
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
		this.z = z;
	}
}
class Base{
	int z = 50;
}

public class MyClient {
	ObjectOutputStream dout;
	public MyClient() throws IOException{
		try{
			Emp e = new Emp("ducat noida",10,5,20,50);
			dout = new ObjectOutputStream(new FileOutputStream("ducat3.txt"));
			dout.writeObject(e);
			dout.flush();
		}catch(Exception ee){
			System.out.println("hello");
		}
	}
	public static void main(String[] ss)throws IOException{
		new MyClient();
	}
}
