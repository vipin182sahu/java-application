import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class JColorChooserTest extends JFrame implements ActionListener{
	public static void main(String[] s){
		new JColorChooserTest();
	}
	public JColorChooserTest(){
		super("using JColorChooser");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container c = getContentPane();
		c.setBackground(Color.white);
		c.setLayout(new FlowLayout());
		JButton colorButton = new JButton("Choose Background color");
		colorButton.addActionListener(this);
		c.add(colorButton);
		setSize(300,400);
		setVisible(true);
	}
 
	public void actionPerformed(ActionEvent e) {
		 Color bgColor = JColorChooser.showDialog(this,"choose background color",Color.red);
		 if(bgColor!= null){
			 getContentPane().setBackground(bgColor);
		 }
	}
}
