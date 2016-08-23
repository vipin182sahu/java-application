package Reflection;
import java.awt.*;
import java.lang.reflect.*;
public class sampleConstructor {
	public static void printConstructor(Object o){
		Class c = o.getClass();
		Constructor cs[]=c.getConstructors();
		for(int i=0; i<cs.length; i++){
			System.out.println(c.getName()+"(");
			Class type[] = cs[i].getParameterTypes();
			for(int k=0; k<type.length; k++){
				System.out.print(type[k].getName()+",");
			}
			System.out.print(")");
			System.out.println("");
		}
	}
	public static void main(String[] ss){
		Thread t = new Thread("ss");
		printConstructor(t);
	}
}
