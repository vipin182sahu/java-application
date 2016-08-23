package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.util.Random;
import java.util.*;



public class PickBallGame extends Applet implements Runnable,ActionListener{
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
		throw new UnsupportedOperationException("not supported");
	}
	
	public void actionPerformed(ActionEvent e){
		
	}
	
	
	public void paint(Graphics g){
		Dimension d = getSize();
		int i = 0;
		
		Random rm = new Random();
		 i = (int)(rm.nextInt(4)-1);		 
			if(i==0){
				int x = (int)(Math.random()*d.width);
				int y = ( int)(Math.random()*d.height);
				g.setColor(Color.red);
				g.fillOval(x-5, y-5, 15, 15);
			}
			if(i==1){
				int x1 = (int)(Math.random()*d.width);
				int y1 = ( int)(Math.random()*d.height);
				g.setColor(Color.yellow);
				g.fillOval(x1, y1, 15, 15);
			}
			if(i==2){
				int x2 = (int)(Math.random()*d.width);
				int y2 = ( int)(Math.random()*d.height);
				g.setColor(Color.black);
				g.fillOval(x2, y2, 15, 15);
			}
			if(i==3){
				int x3 = (int)(Math.random()*d.width);
				int y3 = ( int)(Math.random()*d.height);
				g.setColor(Color.gray);
				g.fillOval(x3, y3, 15, 15);
			}
			if(i==4){
				int x4 = (int)(Math.random()*d.width);
				int y4 = ( int)(Math.random()*d.height);
				g.setColor(Color.green);
				g.fillOval(x4, y4, 15, 15);
			}
		
		super.paint(g);
		
	}
}
