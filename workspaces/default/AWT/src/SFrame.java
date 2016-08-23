
import java.awt.Container;
import java.awt.event.*;
import javax.swing.*;
public class SFrame implements ActionListener{

	 JFrame f;
	 JButton b,b1;
	 JTextField tf;
	 SFrame(String s){
		 f = new JFrame(s);
		 tf = new JTextField();
		 tf.setBounds(40,40,100,100);
		 b = new JButton("swing");
		 b1 = new JButton("awt");
		 b.setBounds(40,200,100,100);
		 b1.setBounds(40,300,50,50);
		 Container c = f.getContentPane();
		 c.add(tf);
		 c.add(b);
		 c.add(b1);
		// f.add(b);
		 b.addActionListener(this);
		// f.add(b1);
	    // f.add(tf);
		 f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); 
		 f.setSize(400,400);
		 f.setVisible(true);
	 }
	 
	 public void actionPerformed(ActionEvent e){
		 tf.setText("swing");
	 }
	 
	public static void main(String[] args) {
		 new SFrame("Swing frame");
	}

}
