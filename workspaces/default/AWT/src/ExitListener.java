import java.awt.*;
import java.awt.event.*;
public class ExitListener extends WindowAdapter{
	public void windowclosing(WindowEvent e){
		System.exit(0);
	}
}
