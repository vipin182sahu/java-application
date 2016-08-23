package Graphics;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
public class Draw3D extends Applet{
	public void paint(Graphics g){
		g.setColor(Color.red);
		g.fill3DRect(20,10,20,30,true);
		
		g.fill3DRect(20,50,100,100,true);
		super.paint(g);
	}
}
