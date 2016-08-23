import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CardLayout1 implements ActionListener {
	JFrame f;
	JPanel p;
	JButton b[];
	CardLayout cl;
	CardLayout1(String s){
		p = new JPanel();
		cl = new CardLayout();
		p.setLayout(cl);
		f = new JFrame(s);
		b = new JButton[5];
		String s1[] = { "North", "South", "East", "West", "Center" };
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton(s1[i]);
			b[i].addActionListener(this);
			f.add(b[i]);
		}
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		cl.next(p);
	}
	public static void main(String[] ss){
		new CardLayout1(" ");
	}
}
