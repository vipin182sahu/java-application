import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculater extends KeyAdapter implements ActionListener {
	JFrame f;
	double c = 0, result = 0, a = 0;
	int t;
	int p = 100;
	int j = 1;
	int l = 0;
	JButton b[];
	TextField tf;

	Calculater(String s) {
		f = new JFrame(s);
		b = new JButton[16];
		tf = new TextField();

		tf.setBounds(30, 30, 220, 30);

		String s1[] = { "1", "2", "3", "C", "4", "5", "6", "+", "7", "8", "9",
				"-", ".", "0", "=", "*" };
		for (int i = 0; i < s1.length; i++) {
			b[i] = new JButton(s1[i]);
			b[i].addActionListener(this);

			if (i == 4 || i == 8 || i == 12) {

				this.p = 100 + i * 20;
				b[i].setBounds(30, p, 50, 50);
				f.add(b[i]);
				this.j = 1;
			} else {
				if (i == 0 || i == 1 || i == 2 || i == 3) {

					b[i].setBounds(30 + l * 50, p, 50, 50);
					f.add(b[i]);
					l++;
				} else {
					b[i].setBounds(30 + j * 50, p, 50, 50);
					f.add(b[i]);
					j++;
				}
			}
		}
		f.add(tf);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 450);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == b[0]) {
			tf.setText(tf.getText().concat("1"));
		}

		if (e.getSource() == b[1]) {
			tf.setText(tf.getText().concat("2"));
		}

		if (e.getSource() == b[2]) {
			tf.setText(tf.getText().concat("3"));
		}

		if (e.getSource() == b[4]) {
			tf.setText(tf.getText().concat("4"));
		}

		if (e.getSource() == b[5]) {
			tf.setText(tf.getText().concat("5"));
		}

		if (e.getSource() == b[6]) {
			tf.setText(tf.getText().concat("6"));
		}

		if (e.getSource() == b[8]) {
			tf.setText(tf.getText().concat("7"));
		}

		if (e.getSource() == b[9]) {
			tf.setText(tf.getText().concat("8"));
		}

		if (e.getSource() == b[10]) {
			tf.setText(tf.getText().concat("9"));
		}

		if (e.getSource() == b[12]) {
			tf.setText(tf.getText().concat("."));
		}

		if (e.getSource() == b[13]) {
			tf.setText(tf.getText().concat("0"));
		}

		if (e.getSource() == b[3]) {
			tf.setText("");
		}
		if (e.getSource() == b[7]) {
			a = Double.parseDouble(tf.getText());
			t = 1;
			tf.setText("");
		}

		if (e.getSource() == b[11]) {
			a = Double.parseDouble(tf.getText());
			t = 2;
			tf.setText("");
		}
		if (e.getSource() == b[15]) {
			a = Double.parseDouble(tf.getText());
			t = 3;
			tf.setText("");
		}
		if (e.getSource() == b[14]) {
			c = Double.parseDouble(tf.getText());
			switch (t) {
			case 1:
				result = a + c;
				break;
			case 2:
				result = a - c;
				break;
			case 3:
				result = a * c;

			default:
				System.out.println("wrong input");
			}
			tf.setText("" + result);
		}
	}

	public static void main(String[] ss) {
		new Calculater("Grid Layout");
	}
}
 
