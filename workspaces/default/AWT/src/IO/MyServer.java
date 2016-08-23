package IO;
import java.io.*;
public class MyServer {
	ObjectInputStream dis;
	public MyServer(){
		try{
			dis = new ObjectInputStream(new FileInputStream("ducat3.txt"));
			Emp z = (Emp)dis.readObject();
			System.out.println("name"+z.name);
			System.out.println("age"+z.age);
			System.out.println("a"+z.a);
			System.out.println("b"+z.b);
			System.out.println("z"+z.z);
			
		}catch(Exception e){}
	}
	public static void main(String[] s){
		new MyServer();
	}
}
