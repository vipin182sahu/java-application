package Graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;

class MyCanvas2 extends Canvas {
	int flag;

	public void paint(Graphics g) {
		if (flag == 1) {
			for (int i = 0; i < 12; i++) {
				g.setColor(Color.red);
				g.drawLine(50, 50, 300, 70 + i * 20);
				i++;
			}
		}
		if (flag == 2) {
			for (int i = 0; i < 12; i++) {
				g.setColor(Color.blue);
				g.drawLine(50, 50, 300, 70 + i * 20);
				i++;
			}
		}
		if (flag == 3) {
			for (int i = 0; i < 12; i++) {
				g.setColor(Color.gray);
				g.drawLine(50, 50, 300, 70 + i * 20);
				i++;
			}
		}
		if (flag == 4) {
			for (int i = 0; i < 12; i++) {
				g.setColor(Color.green);
				g.drawLine(50, 50, 300, 70 + i * 20);
				i++;
			}
		}
		if (flag == 5) {
			for (int i = 0; i < 12; i++) {
				g.setColor(Color.yellow);
				g.drawLine(50, 50, 300, 70 + i * 20);
				i++;
			}
		}
	}
}

class Myf2 extends Thread implements ActionListener {
	MyCanvas2 m = new MyCanvas2();
	JButton b;

	Myf2() {
		JFrame f = new JFrame("graphics");
		b = new JButton("line");

		f.add(m);
		f.add(b);
		b.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400, 400);

		f.setLayout(new GridLayout(2, 1));
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		m.flag = 0;
		if (e.getSource() == b) {

			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(1000);

					m.repaint();

				} catch (InterruptedException e1) {

				}
				m.flag++;
			}
		}
	}

	public static void main(String[] ss) {
		new Myf2();
	}
}
