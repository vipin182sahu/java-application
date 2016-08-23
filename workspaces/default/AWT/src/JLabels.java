import java.awt.*;
import javax.swing.*;
public class JLabels extends JFrame{
	public static void main(String[] s){
		new JLabels();
	}
	public JLabels(){
		super("using html in jlabels");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container c = getContentPane();
		Font font = new Font("serif",Font.PLAIN,30);
		c.setFont(font);
		String labelText = "<html><FONT COLOR = RED>red</FONT>and "+"<FONT COLOR = BLUE>blue</FONT>Text</html> ";
		
		JLabel coloredLabel = new JLabel(labelText,JLabel.CENTER);
		coloredLabel.setBorder(BorderFactory.createTitledBorder("Mixed Colors"));
		c.add(coloredLabel,BorderLayout.NORTH);
		labelText = "<html><b>Bold</b>and<I>Italic</I>Text</html>";
		
		JLabel boldLabel =new JLabel(labelText,JLabel.CENTER);
		boldLabel.setBorder(BorderFactory.createTitledBorder("Mixed fonts"));
		c.add(boldLabel,BorderLayout.CENTER);
		labelText = "<html><b>india is a great countryin the world<p>Major cities of india<ul><li>delhi<li>noida<li>kanpur</ul></html>";
		
		JLabel fancyLabel = new JLabel(labelText,JLabel.CENTER);
		fancyLabel.setBorder(BorderFactory.createTitledBorder("Multi-line Html"));
		c.add(fancyLabel,BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
}
