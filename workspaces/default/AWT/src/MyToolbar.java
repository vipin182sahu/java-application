import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MyToolbar extends JFrame implements ActionListener{
	TextField t = new TextField();
	JToolBar jt = new JToolBar("my");
	JFrame f = new JFrame("MyFrame");
	JButton b = new JButton();
	JButton b1 = new JButton("ok");
	
	MyToolbar(){
		Container c = f.getContentPane();
		b.setBackground(Color.red);
		b.addActionListener(this);
		jt.add(b);
		jt.add(b1);
		c.add(t);
		c.add(jt);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		t.setText("hello");
	}
	public static void main(String[] s){
		new MyToolbar();
	}
}
