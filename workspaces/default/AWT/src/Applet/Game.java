
package Applet;

//<applet code="BallsGame" height= 500 width= 510></applet>

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import java.applet.*;
public class Game extends Applet implements ActionListener,Runnable{
	Button start,stop,low,medium,high;
	Button b[];
	Color c;
	int duration = 225;
	Thread ballsRun;
	int count;
	int i;
	int level = 100;
	
	public void init(){
		start = new Button("start");
		start.setBounds(150,360,80,30);
		add(start);
		stop = new Button("stop");
		start.setBounds(260,360,80,30);
		add(start);
		start.addActionListener(this);
		stop.addActionListener(this);
		
		low = new Button("low");
		medium = new Button("medium");
		high = new Button("high");
		low.setBounds(100,450,70,30);
		medium.setBounds(220,450,70,30);
		high.setBounds(350,450,70,30);
		add(low);
		add(medium);
		add(high);
		low.addActionListener(this);
		medium.addActionListener(this);
		high.addActionListener(this);
		
		String s[]= {"Red","Blue","Green","Yellow","Pink","Orange","Black","Gray"};
		b = new Button[8];
		for(i=0 ; i<b.length;i++){
			b[i] = new Button(s[i]);
			b[i].addActionListener(this);
			b[i].setBounds(10+i*60+9,410,60,25);
			add(b[i]);
		}
		
		setLayout(null);
		ballsRun = new Thread(this);
		
	}
	public void actionPerformed(ActionEvent ae){
		count++;
		if(ae.getSource()== start && count == 1){
			ballsRun.start();
		}
		if(ae.getSource()== start && count >1){
			ballsRun.resume();
		}
		if(ae.getSource()== stop){
			ballsRun.suspend();
		}
		if(ae.getActionCommand()=="Red"){
			ballsRun.suspend();
			if(c== Color.RED){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Gray"){
			ballsRun.suspend();
			if(c== Color.GRAY){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Blue"){
			ballsRun.suspend();
			if(c== Color.BLUE){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Green"){
			ballsRun.suspend();
			if(c== Color.GREEN){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Yellow"){
			ballsRun.suspend();
			if(c== Color.YELLOW){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Pink"){
			ballsRun.suspend();
			if(c== Color.PINK){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Orange"){
			ballsRun.suspend();
			if(c== Color.ORANGE){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getActionCommand()=="Bloack"){
			ballsRun.suspend();
			if(c== Color.BLACK){
				JOptionPane.showMessageDialog(null,"you win");
			}
			else{
				JOptionPane.showMessageDialog(null,"you loss, try again");
			}
		}
		if(ae.getSource()== low){
			duration = 300;
		}
		if(ae.getSource()== medium){
			duration = 225;
		}
		if(ae.getSource()== high){
			duration = 150;
		}
	}
	
	
	public void run(){
		while(true){
			for(i=0; i<8;i++){
				repaint();
				try{
					ballsRun.sleep(duration);
				}
				catch(Exception e){}
			}
		}
	}
	public void paint(Graphics g){
		if(i==0)
		{
			g.setColor(Color.RED);
			g.fillOval(100,30,30,30);
			g.fillOval(350,150,30,30);
		}
		if(i==1)
		{
			g.setColor(Color.BLUE);
			g.fillOval(200,250,30,30);
			g.fillOval(300,70,30,30);
		}
		if(i==2)
		{
			g.setColor(Color.GREEN);
			g.fillOval(140,200,30,30);
			g.fillOval(300,250,30,30);
		}
		if(i==3)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(70,150,30,30);
			g.fillOval(160,70,30,30);
		}
		if(i==4)
		{
			g.setColor(Color.PINK);
			g.fillOval(170,300,30,30);
			g.fillOval(400,200,30,30);
		}
		if(i==5)
		{
			g.setColor(Color.ORANGE);
			g.fillOval(150,130,30,30);
			g.fillOval(350,30,30,30);
		}
		if(i==6)
		{
			g.setColor(Color.BLACK);
			g.fillOval(225,70,30,30);
			g.fillOval(130,200,30,30);
		}
		if(i==7)
		{
			g.setColor(Color.GRAY);
			g.fillOval(115,200,30,30);
			g.fillOval(330,200,30,30);
		}
		if(i==8)
		{
			g.setColor(new Color(100,70,10));;
			g.fillOval(200,300,30,30);
			g.fillOval(420,200,30,30);
		}
		c= g.getColor();
		Font font = new Font("serif",Font.PLAIN,30);
		g.setFont(font);
		g.drawString("for you dear", 200, 30);
	}
}
