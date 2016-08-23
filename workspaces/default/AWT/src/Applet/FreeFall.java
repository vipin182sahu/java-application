package Applet;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;

//<applet code= "JumpingBall" height = 500; width=500></applet>
public class FreeFall extends Applet implements Runnable,ActionListener{
	int top = 30,left=100;
	int diameter =50;
	Button start,stop;
	int c=0;
	Thread thread;
	int moveX=0; int moveY=0;
	
	public void init(){
		setBackground(Color.pink);
		start = new Button("start");
		stop = new Button("stop");
		start.setBounds(250,400,80,30);
		stop.setBounds(350,400,80,30);
		add(start);
		add(stop);
		start.addActionListener(this);
		stop.addActionListener(this);
		thread = new Thread(this);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent e){
		c++;
		if(e.getSource()== start && c==1){
			thread.start();
		}
		if(e.getSource()== start && c>1){
			thread.resume();
		}
		if(e.getSource()== stop){
			try{
				thread.suspend();
			}catch(Exception ae){}
			
		}
	}
	
	public void run() {
		 while(true){
			 moveY = 0;
			 for(moveX=0 ; moveX<=300; moveX++)
			 {
				 repaint();
				 try{
					 
					 thread.sleep(10);
					 
				 }catch(Exception ae){
				 }
			 }
			 moveX=300;
			 for(moveX=300 ; moveX>=0; moveX--){
				 repaint();
				 try{
					 thread.sleep(10);
				 }catch(Exception ae){
				 }
			 }
			 moveX=0;
		 }
	}
	public void paint(Graphics g){
		 
		g.setColor(Color.red);
		g.fillOval(left+moveX, top+300, diameter, diameter);
		g.setColor(Color.red);
		g.fillOval(left+60+moveX, top+300, diameter, diameter);
		g.fillRect(left+moveX,top+290-diameter,110,60);
		g.drawLine(left, top+350, left+410,top+350);
		g.drawLine(left+410,top+350,left+410,top);
	
	}
}
