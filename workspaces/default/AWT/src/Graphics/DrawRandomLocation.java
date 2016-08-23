package Graphics;
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class DrawRandomLocation extends Applet implements Runnable {
	Thread th;
	public void init(){
		th = new Thread(this);
		th.start();
		super.init();
	}
	public void run(){
		try{
			while(true){
				repaint();
				Thread.sleep(1000);
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	//	throw new UnsupportedOperationException("not support");
	}
	/*public void update(Graphics g){
		paint(g);
		super.update(g);
	}*/
	public void paint(Graphics g){
		Dimension d = getSize();
		int x = (int)(Math.random()*d.width);
		int y = (int)(Math.random()*d.height);
		g.setColor(Color.green);
		g.fillOval(x, y,12,12);
		int x1 = (int)(Math.random()*d.width);
		int y1 = (int)(Math.random()*d.height);
		g.setColor(Color.black);
		g.fillOval(x1, y1,12,12);
		int x2 = (int)(Math.random()*d.width);
		int y2 = (int)(Math.random()*d.height);
		g.setColor(Color.blue);
		g.fillOval(x2, y2,12,12);
		int x3 = (int)(Math.random()*d.width);
		int y3 = (int)(Math.random()*d.height);
		g.setColor(Color.red);
		g.fillOval(x3, y3,12,12);
		int x4 = (int)(Math.random()*d.width);
		int y4 = (int)(Math.random()*d.height);
		g.setColor(Color.yellow);
		g.fillOval(x4, y4,12,12);
			super.paint(g);
	}
	
	
}
