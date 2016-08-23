import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JInternalFramess extends JFrame{
	public static void main(String[] ss){
		new JInternalFramess();
	}
	public JInternalFramess(){
		super("multiple document Interface");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container c = getContentPane();
		c.setBackground(Color.white);
		JDesktopPane desktop = new JDesktopPane();
		desktop.setBackground(Color.white);
		c.add(desktop,BorderLayout.CENTER);
		setSize(500,400);
		for(int i=0; i<5 ; i++){
			JInternalFrame frame = new JInternalFrame(("Internal Frame"+i),true,true,true,true);
			frame.setLocation(i*50+10,i*50+10);
			frame.setSize(200,150);
			frame.setBackground(Color.red);
			frame.setVisible(true);
			desktop.add(frame);
			frame.toFront();
		}
		setVisible(true);
	}
}
