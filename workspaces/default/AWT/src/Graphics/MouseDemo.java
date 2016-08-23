package Graphics;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseDemo  {
	public static void main(String[] ss){
		xyz obj = new xyz();
	}
}
class xyz extends JFrame{
	public xyz(){
		addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				int x = e.getX();
				int y = e.getY();
				System.out.println(x+","+y);
			}
		});
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
