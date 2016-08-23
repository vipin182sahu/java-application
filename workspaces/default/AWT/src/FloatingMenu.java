import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class FloatingMenu extends MouseAdapter{
	JFrame f = new JFrame();
	JPopupMenu p = new JPopupMenu("Pop");
	JMenuItem i1 = new JMenuItem("new");
	JMenuItem i2 = new JMenuItem("open");
	JMenuItem i3 = new JMenuItem("save");
	JMenuItem i4 = new JMenuItem("exit");
	FloatingMenu(){
		p.add(i1);
		p.add(i2);
		p.add(i3);
		p.add(i4);
		f.addMouseListener(this);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public void mouseClicked(MouseEvent e){
		int x = e.getButton();
		if(x== MouseEvent.BUTTON3)
			p.show(e.getComponent(),e.getX(),e.getY());
	}
	public static void main(String[] ss){
		new FloatingMenu();
	}
}
