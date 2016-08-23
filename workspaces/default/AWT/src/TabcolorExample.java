import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TabcolorExample extends JPanel{
	public TabcolorExample(){
		setLayout(new BorderLayout());
		UIManager.put("TabbedPane.selected", Color.green);
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
		String tabs[]= {"one","two","three","four"};
		Color []colors = {null,Color.red,Color.blue,Color.yellow};
		
		for(int i=0; i<tabs.length; i++){
			tabbedPane.addTab(tabs[i], createPane(tabs[i]));
			tabbedPane.setBackgroundAt(i,colors[i]);
		}
		tabbedPane.setSelectedIndex(0);
		add(tabbedPane,BorderLayout.CENTER);
	}
	JPanel createPane(String s){
		JPanel p = new JPanel();
		p.add(new JLabel(s));
		return p;
	}
	public static void main(String[] ss){
		JFrame frame = new JFrame("Tab color Example");
		frame.addWindowFocusListener(new WindowAdapter(){
			public void sindowClosing(WindowEvent e){
				System.exit(0);
			}
		}
		);
		frame.getContentPane().add(new TabcolorExample());
		frame.setSize(400,400);
		frame.setVisible(true);
		
	}
}
