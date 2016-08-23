package Reflection;

import java.awt.*;
import java.lang.reflect.*;
public class sampleFiled {
	public static void printFields(Object o){
		Class c = o.getClass();
		Field[] f = c.getFields();
		for(int i =0; i<f.length; i++){
			System.out.println("");
			Class type = f[i].getType();
			System.out.println(type.getName());
			System.out.println(""+f[i].getName());
		}
	}
	public static void main(String[] ss){
		Color c = new Color(1,1,1);
		printFields(c);
	}
}
