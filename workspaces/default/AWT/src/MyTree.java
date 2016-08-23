import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class MyTree {
	JFrame jf;
	JTree jt;
	JScrollPane jp;
	
	MyTree(){
		jf = new JFrame("Tree demo");
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("style");
		DefaultMutableTreeNode Color = new DefaultMutableTreeNode("color");
		DefaultMutableTreeNode font = new DefaultMutableTreeNode("font");
		root.add(Color);
		root.add(font);
		
		DefaultMutableTreeNode red = new DefaultMutableTreeNode("red");
		DefaultMutableTreeNode green = new DefaultMutableTreeNode("green");
		DefaultMutableTreeNode blue = new DefaultMutableTreeNode("blue");
		Color.add(red);
		Color.add(green);
		Color.add(blue);
		
		DefaultMutableTreeNode bold = new DefaultMutableTreeNode("bold");
		DefaultMutableTreeNode italic = new DefaultMutableTreeNode("Italic");
		DefaultMutableTreeNode un = new DefaultMutableTreeNode("un");
		font.add(bold);
		font.add(italic);
		font.add(un);
		
		jt = new JTree(root);
		jp = new JScrollPane(jt);
		jf.add(jp);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
	public static void main(String[] ss){
		new MyTree();
	}
}
