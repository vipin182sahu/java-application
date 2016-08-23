import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class JInternalFrames extends JFrame {
	public static void main(String[] s){
		new JInternalFrames();
	}
	public JInternalFrame(){
		super("Multiple Document Interface");
		setNativeLookAndFeel();
		addWindowListener(new ExitListener);
	}
	private void setNativeLookAndFeel() {
		// TODO Auto-generated method stub
		
	}
}
public class ExitListener extends WindowAdapter{
	public void windowclosing(WindowEvent e){
		System.exit(0);
	}
}
