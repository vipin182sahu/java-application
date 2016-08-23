import java.awt.*;
import javax.swing.*;

public class GLayout {
	JFrame f;
	JButton b[];

	GLayout(String s) {
		f = new JFrame(s);
		b = new JButton[5];
		String s1[] = { "North", "South", "East", "West", "Center" };
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton(s1[i]);
			f.add(b[i]);
		}
		f.setLayout(new GridLayout(2,3));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] ss){
		new GLayout(" ");
	}
}
