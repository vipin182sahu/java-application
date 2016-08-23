import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Word implements ActionListener{
	
	JFrame f ;
	JButton b;
	TextField tf1,tf2;
	Word(){
		f = new JFrame();
		b = new JButton("");
		tf1 = new TextField();
		tf2 = new TextField();
		tf1.setBounds(30,30,100,30);
		tf2.setBounds(30,70,100,30);
		f.add(tf1);
		f.add(tf2);
		b.setBounds(30,150,60,40);
		b.addActionListener(this);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()== b){
			tf1.getText();
		}
	}
	public static void main(String[] ss){
		new Word();
	}
}
