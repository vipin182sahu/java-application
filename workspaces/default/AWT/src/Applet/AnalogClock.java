package Applet;
/*<applet code="AnalogClock" height=400 width=400>
</applet>*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;
import java.util.Date.*;

public class AnalogClock extends Applet implements Runnable
{
	int left = 50 , top = 50;
	int diameter = 300;
	int radius = 150;
	int secHand = radius;
	int minHand = radius*4/5;
	int hourHand = radius*3/5;
	int centerX = left+radius;
	int centerY = top+radius;
	Date currentTime;
	Thread startClock;
	
	public void init()
	{ 
		setBackground(Color.pink);
	}
	
	public void start()
	{
		if(startClock==null)
		{
			startClock = new Thread(this,"MyClock");
			startClock.start();
		}
	}
	
	public void run()
	{
		Thread runClock = Thread.currentThread();
		while(runClock==startClock)
		{
			repaint();
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
	
	public void paint(Graphics g)
	{
		Font f = new Font("serif",Font.PLAIN,30);
		g.setFont(f);
		g.setColor(new Color(100,70,10));
		g.drawString("Ravi Kumar Sahu",100,30);
		
		currentTime = new Date();
		int seconds = currentTime.getSeconds();
		int minutes = currentTime.getMinutes();
		int hours = currentTime.getHours();
		
		
		double secAngle = 2*(Math.PI/60*(seconds-15));
		double minAngle = 2*(Math.PI/60*(minutes-15));
		double hourAngle = 2*(Math.PI/12*(hours-3)) + Math.PI/360*minutes;
		
		//double numAngle = Math.PI/3-Math.PI/6*n;
		
		g.setColor(Color.YELLOW);
		g.fillOval(left,top,diameter,diameter);
		
		g.setColor(Color.RED);
		g.drawLine(centerX,centerY,centerX+(int)(secHand*Math.cos(secAngle)),centerY+(int)(secHand*Math.sin(secAngle)));
		
		g.setColor(Color.BLACK);
		g.drawLine(centerX,centerY,centerX+(int)(minHand*Math.cos(minAngle)),centerY+(int)(minHand*Math.sin(minAngle)));
		
		g.setColor(Color.BLUE);
		g.drawLine(centerX,centerY,centerX+(int)(hourHand*Math.cos(hourAngle)),centerY+(int)(hourHand*Math.sin(hourAngle)));
		
		for(int n=1;n<=12;n++) //This is for printing the numbers in the clock....
		{
			Font font = new Font("Serif",Font.PLAIN,20);
			g.setColor(Color.BLACK);
			g.setFont(font);
			
			double numX = centerX-5+radius*9/10*(Math.cos(Math.PI*3/2+Math.PI/6*n));
			double numY = centerY+5+radius*9/10*(Math.sin(Math.PI*3/2+Math.PI/6*n));
			
			g.drawString(""+n,(int)numX,(int)numY);
			
		}
	}
}
