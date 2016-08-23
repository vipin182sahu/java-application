/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RadioButtonPanel extends JFrame
{
	RadioButtonPanel(String labelString, JRadioButton rb[], ButtonGroup bg)
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(labelString));
		for(int i=0;i<rb.length;i++)
		{
			bg.add(rb[i]);
			add(rb[i]);
		}
		pack();
		setVisible(true);
	}
	
	public static void main(String... s)
	{
		JRadioButton rb[] = new JRadioButton[5];
		for(int i=0;i<rb.length;i++)
		{
			rb[i] = new JRadioButton(i+1+"");
		}
		ButtonGroup bg = new ButtonGroup();
		new RadioButtonPanel("Jrbex",rb,bg);
	}
}
*/
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class RadioButtonPanel extends JFrame {
	RadioButtonPanel(String labelString, JRadioButton[] rb, ButtonGroup bg){
		setLayout(new FlowLayout(FlowLayout.LEFT));
		add(new JLabel(labelString));
		for(int i=0;i<rb.length ;i++)
		{
			bg.add(rb[i]);
			add(rb[i]);
		}
		pack();
		setVisible(true);
	}

	public static void main(String[] ss) {
		JRadioButton rb1[] = new JRadioButton[5];
		for(int i=0;i<rb1.length;i++)
		{
			rb1[i] = new JRadioButton(i+1+"");
		}
		ButtonGroup bg = new ButtonGroup();
		new RadioButtonPanel("Jrbex",rb1,bg);
		}
	}

