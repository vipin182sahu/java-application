package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Myf3 implements ActionListener{
	Button b;
	Myf3(){
		Frame f = new Frame("graphics");
		b=new Button();
		b.setBounds(50,50,300,300);
		b.addActionListener(this);
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		Graphics g = b.getGraphics();
		g.drawLine(70,70,200,200);
		g.drawOval(70, 70, 200, 200);
	}
	public static void main(String[] ss){
		new Myf3();
	}
}
