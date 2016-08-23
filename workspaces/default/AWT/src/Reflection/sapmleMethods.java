package Reflection;
import java.awt.*;
import java.lang.reflect.*;
public class sapmleMethods {
	public static void printMethods(Object o){
		Class c = o.getClass();
		Method m[] =c.getMethods();
		for(int i = 0 ; i<m.length; i++){
			System.out.print(m[i].getReturnType().getName());
			System.out.print(" "+m[i].getName());
			System.out.print("(");
			Class type[] = m[i].getParameterTypes();
			for(int k=0; k<type.length; k++){
				System.out.println(type[k].getName()+"");
			}
			System.out.println(")");
			System.out.println("");
			
		}
	}
	public static void main(String[] ss){
		String s = new String("ravi");
		printMethods(s);
	}
}
