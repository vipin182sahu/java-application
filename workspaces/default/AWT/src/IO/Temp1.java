package IO;
import java.io.*;
public class Temp1{
	int x = getX();
	int getX(){
		return 10;
	}
	public static void main(String[] ss){
		System.out.println(new Temp1().x);
	}
}




/*public class Temp1 {
	static int x = getX();
	static int getX(){
		return 10;
	}
	 
	public static void main(String[] ss){
		System.out.println(x);
	}
}*/
