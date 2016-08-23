package Reflection;
import java.awt.*;
import java.lang.reflect.*;
public class sampleInterface {
	public static void printInterfaces(Object o){
		Class c = o.getClass();
		Class inter[] = c.getInterfaces();
		for(int i = 0; i<inter.length; i++){
			System.out.println(inter[i].getName());
		}
	}
	public static void main(String[] ss){
		t t1 = new t();
		printInterfaces(t1);
	}
}
interface a1 {}
interface a2 {}
interface a3 {}

class t implements a1,a2,a3 {}
