import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;
public class JListt extends JFrame{
	public static void main(String[] ss){
		new JListt();
	}
	private JList sampleJList;
	private JTextField valueField;
	
	public JListt(){
		super("getting a simple List");
		WindowUtilities.setNativeLookAndFeel();
		addWindowListener(new ExitListener());
		Container c = getContentPane();
		
		String []entries ={"Entry1","Entry2","Entry3","Entry4","Entry5","Entry6"};
		sampleJList = new JList(entries);
		sampleJList.setVisibleRowCount(4);
		Font displayFont = new Font("serif",Font.BOLD,18);
		sampleJList.setFont(displayFont);
		sampleJList.addListSelectionListener(new ValueReporter());

		JScrollPane listPane = new JScrollPane(sampleJList);
		
	}
}