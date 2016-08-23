package Graphics;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*;
public class Test implements ActionListener{
	Ellipse2D e1,e2;
	Graphics2D g;
	JButton b;
	JFrame f;
	Test(){
		f = new JFrame();
		b = new JButton();
		b.setBounds(10,10,300,300);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b ){
			g =(Graphics2D) b.getGraphics();
			
			g.draw(e1);

		}
	}
	public static void main(String[] ss){
		new Test();
	}
}
