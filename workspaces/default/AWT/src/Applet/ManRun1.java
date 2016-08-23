package Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.applet.*;

public class ManRun1 extends Applet implements Runnable,ActionListener {
	Button start,stop;
	Thread thread;
	int moveX=0,moveY=0;
	int c=0;
	
	public void init(){
		setBackground(Color.pink);
		start = new Button("start");
		start.setBounds(150,400,80,30);
		add(start);
		stop = new Button("stop");
		stop.setBounds(260,400,80,30);
		add(stop);
		start.addActionListener(this);
		stop.addActionListener(this);
		thread = new Thread(this);
		setLayout(null);
	}
	
	public void actionPerformed(ActionEvent ae){
		c++;
		if(ae.getSource()== start && c==1){
			thread.start();
		}
		if(ae.getSource()==start && c>1){
			thread.resume();
		}
		if(ae.getSource()== stop){
			try{
				thread.suspend();
			}catch(Exception e){}
		}
		
	}
		public void run(){
			while(true){
				for(moveX=0;moveX<=360;moveX++){
					repaint();
					try{
						thread.sleep(10);
					}catch(Exception e){}
				}
				moveX=360;
				for(moveY =0;moveY<=250; moveY++){
					repaint();
					try{
						thread.sleep(10);
					}catch(Exception e){}
				}
				moveY=250;
				for(moveX=360; moveX>=0; moveX--){
					repaint();
					try{
						thread.sleep(10);
					}catch(Exception e){}
				}
				moveX=0;
				for(moveY=250; moveY >=0;moveY--){
					repaint();
					try{
						thread.sleep(10);
					}catch(Exception e){}
				}
				moveY=0;
			}
		}
		public void paint(Graphics g){
			int top =30,left=30;
			int diameter = 50;
			if((moveX<360 && moveY==0) ||(moveX<360 && moveY==250)){
				g.setColor(Color.blue);
				g.drawOval(left+moveX,top+moveY,diameter,diameter);
				g.drawLine(left+25+moveX,top+diameter+moveY,left+25+moveX,top+diameter+40+moveY);
				g.drawLine(left+moveX,top+diameter+10+moveY,left+25+moveX,top+diameter+25+moveY);
				g.drawLine(left+25+moveX,top+diameter+25+moveY,left+50+moveX,top+diameter+10+moveY);
				g.drawLine(left+25+moveX,top+diameter+40+moveY,70+moveX,top+diameter+60+moveY);
				g.drawLine(left+25+moveX,top+diameter+40+moveY,40+moveX,top+diameter+60+moveY);
				
			}
			if((moveX==360 && moveY>=0) || (moveX==0 && moveY>0))
			{
				g.setColor(Color.red);
				g.drawOval(left+moveX,top+moveY,diameter,diameter);
				g.drawLine(left+25+moveX,top+diameter+moveY,left+25+moveX,top+diameter+40+moveY);
				g.drawLine(left+moveX,top+diameter+10+moveY,left+25+moveX,top+diameter+25+moveY);
				g.drawLine(left+25+moveX,top+diameter+25+moveY,left+50+moveX,top+diameter+10+moveY);
				g.drawLine(left+25+moveX,top+diameter+40+moveY,70+moveX,top+diameter+60+moveY);
				g.drawLine(left+25+moveX,top+diameter+40+moveY,40+moveX,top+diameter+60+moveY);
						
			}	
		}
}

 