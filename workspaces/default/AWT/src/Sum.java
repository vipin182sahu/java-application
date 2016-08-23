import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sum implements ActionListener {
	JFrame f;
	JButton b;
	TextField tf,tf1,tf2;
	Sum(){
		f = new JFrame("aa");
		b = new JButton("sum");
		b.addActionListener(this);
		
		tf = new TextField();
		tf1 = new TextField();
		tf2 = new TextField();
		f.add(tf);
		f.add(tf1);
		f.add(tf2);
		f.add(b);
		
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		//String s1 = tf.getText();
		//String s2 = tf1.getText();
		int n1 = Integer.parseInt(tf.getText());
		int n2 = Integer.parseInt(tf1.getText());
		int n3 = n1 + n2 ;
		tf2.setText(String.valueOf(n3));
	}
	public static void main(String[] ss){
		new Sum();
	}
}
