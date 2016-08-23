/*package Graphics;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;
import javax.swing.*;
public class GraphDisplayTest extends JFrame {
	private JButton changeColorBtn = new JButton("Chenge Color");
	private Graphics2D g2;
	private Ellipse2D e1;
	private Ellipse2D e2;
	private Ellipse2D e3;
	private Ellipse2D e4;
	int x = 50, y = 50, w = 20, h= 20;
	
	public static void main(String[] ss){
		new GraphDisplayTest();
	}
	public void GraphDisplayTest(){
		setLayout(new BorderLayout());
		add(changeColorBtn, BorderLayout.SOUTH);
		
		changeColorBtn.addActionListener(new ChangeColor());
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Graph Display Example");
		setSize(350,400);
		setVisible(true);
	}

	public class ChangeColor implements ActionListener {
		public void actionPerformed(ActionEvent e){
			g2.setPaint(Color.BLACK);
			g2.fill(e1);
			g2.drawLine( x+10, y+10, x+210, y+10);
			g2.setColor(Color.WHITE);
		}
	}
	public void paint(Graphics g) {
		g2 = (Graphics2D) g;

		g2.drawLine( x+10, y+10, x+210, y+10);
		g2.setColor(Color.black);
		g2.drawLine( x+210, y+10, x+210, y+210);
		g2.setColor(Color.black);
		g2.drawLine( x+10, y+210, x+210, y+210);
		g2.setColor(Color.black);
		g2.drawLine( x+10, y+10, x+210, y+210);
		g2.setColor(Color.black);
		
		e1 = new Ellipse2D.Double(x, y, w, h);
		g2.setPaint(Color.BLUE);
		g2.fill(e1);
		e2= new Ellipse2D.Double(x+200,y,w,h);
		g2.setPaint(Color.red);
		g2.fill(e2);
		e3 =new Ellipse2D.Double(x+200,y,w,h);
		g2.setPaint(Color.green);
		g2.fill(e3);
		e4 =new Ellipse2D.Double(x+200,y,w,h);
		g2.setPaint(Color.yellow);
		g2.fill(e4);
	}
}
 */
package Graphics;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GraphDisplayTest extends JFrame {

	// static GraphDisplayTest gui;

	private JButton changeColorBtn = new JButton("Change Color");
	private Graphics2D g2;
	private Ellipse2D e1;
	private Ellipse2D e2;
	private Ellipse2D e3;
	private Ellipse2D e4;
	int x = 50, y = 50, w = 20, h = 20;

	public static void main(String[] args) {
		new GraphDisplayTest();
	}

	public void GraphDisplayTest() {
		setLayout(new BorderLayout());
		add(changeColorBtn, BorderLayout.SOUTH);

		changeColorBtn.addActionListener(new ChangeColor());
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Graph Display Example");
		setSize(350, 400);
		setVisible(true);
	}


	public class ChangeColor implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			// HERE IS THE PROBLEM - the colors are not being reset
			g2.setPaint(Color.BLACK);
			g2.fill(e1);
			g2.drawLine(x + 10, y + 10, x + 210, y + 10);
			g2.setColor(Color.WHITE);
		}
	}

	public void paint(Graphics g) {
		g2 = (Graphics2D) g;
		g2.drawLine(x + 10, y + 10, x + 210, y + 10);
		g2.setColor(Color.BLACK);
		g2.drawLine(x + 210, y + 10, x + 210, y + 210);
		g2.setColor(Color.BLACK);
		g2.drawLine(x + 10, y + 210, x + 210, y + 210);
		g2.setColor(Color.BLACK);
		g2.drawLine(x + 10, y + 10, x + 10, y + 210);
		g2.setColor(Color.BLACK);

		e1 = new Ellipse2D.Double(x, y, w, h);
		g2.setPaint(Color.BLUE);
		g2.fill(e1);
		e2 = new Ellipse2D.Double(x + 200, y, w, h);
		g2.setPaint(Color.RED);
		g2.fill(e2);
		e3 = new Ellipse2D.Double(x, y + 200, w, h);
		g2.setPaint(Color.GREEN);
		g2.fill(e3);
		e4 = new Ellipse2D.Double(x + 200, y + 200, w, h);
		g2.setPaint(Color.YELLOW);
		g2.fill(e4);

	}

}