package Applet;

/*<applet code = "TestApplet1" height = 400, width = 400>
</applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class TestApplet1 extends Applet{
	String s;
	public TestApplet1(){
		s = "Cnstructor";
	}
	public void init(){
		setBackground(Color.RED);
		s = s + "init";
		display();
	}
	public void start(){
		
	}
	public void paint(Graphics g){
		s= s + "paint";
		g.drawString(s, 30, 30);
	}
	public static void main(String[] ss){
		System.out.println("main");
		TestApplet1 t = new TestApplet1();
		System.out.println(t.s);
	}
	void display(){
		s= s+ "Display";
		//System.out.println(s);
	}
}
