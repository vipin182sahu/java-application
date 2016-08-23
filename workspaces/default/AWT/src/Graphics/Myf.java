package Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Mycanvas extends Canvas{
	Image i;
	Mycanvas(){
		Toolkit t = Toolkit.getDefaultToolkit();
		i = t.getImage("D:\\Photos\\Z squre\\2\\DSCN4319.JPG");
	}
	public void paint(Graphics g){
		g.drawImage(i,100,100,this);
	}
}

public class Myf extends Frame{
	Myf(){
		super("Graphics");
		Mycanvas m = new Mycanvas();
		add(m);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] ss){
		new Myf();
	}
	
}
