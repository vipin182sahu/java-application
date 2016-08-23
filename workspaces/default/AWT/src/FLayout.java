import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.*;
import javax.swing.*;
public class FLayout {
	JFrame f;
	JButton b[];
	FLayout(String s){
		f = new JFrame(s);
		b = new JButton[5];
		String s1[] ={"North","South","East","West","Center" };
		for(int i=0; i<b.length ; i++){
			b[i] = new JButton(s1[i]);
			f.add(b[i]);
		}
		f.setLayout(new FlowLayout(FlowLayout.LEADING));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String[] ss){
		new FLayout(" ");
	}
}
