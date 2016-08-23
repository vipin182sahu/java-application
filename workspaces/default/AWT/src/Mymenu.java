import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class Mymenu implements ActionListener
{
	JFrame f = new JFrame("My Menu");
	JMenuBar menuBar;
	JMenu menu,subMenu;
	JMenuItem menuItem,exit;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	JTextField tf;
	
	Mymenu()
	{
		tf = new JTextField();
		f.add(tf);
		tf.setBounds(200,200,100,30);
		menuBar = new JMenuBar();
		menu = new JMenu("First Menu");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		menuItem = new JMenuItem("The text-only menu item",KeyEvent.VK_T);
		menuItem.addActionListener(this);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
		menu.add(menuItem);
		
		//a group of radiobuttons menu items...
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem  = new JRadioButtonMenuItem("A radio button menu item");
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		rbMenuItem.setSelected(true);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		rbMenuItem = new JRadioButtonMenuItem("Another radio button");
		rbMenuItem.setMnemonic(KeyEvent.VK_O);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		//a group of checkBox menu items
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A checkBox menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);
		
		cbMenuItem = new JCheckBoxMenuItem("Another checkBox menu item");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);
		
		//a submenu menu item....
		menu.addSeparator();
		subMenu = new JMenu("Submenu");
		subMenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("An item in Submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A,ActionEvent.ALT_MASK));
		subMenu.add(menuItem);
		
		menuItem = new JMenuItem("Another item in Submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.ALT_MASK));
		subMenu.add(menuItem);
		menu.add(subMenu);
		
		exit = new JMenuItem("Exit");
		exit.addActionListener(this);
		exit.setMnemonic(KeyEvent.VK_E);
		exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,ActionEvent.ALT_MASK));
		menu.add(exit);
		
		//Build second menu....
		menu = new JMenu("Another Menu");
		menuItem = new JMenuItem("Undo");
		menuItem.setMnemonic(KeyEvent.VK_U);
		menu.add(menuItem);
		menuBar.add(menu);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setJMenuBar(menuBar);
		f.setSize(400,400);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event)
	{
		if(event.getActionCommand().equals("Exit"))
		{
			System.exit(0);
		}
		if(event.getActionCommand().equals("The text-only menu item"))
		{
			tf.setText("Hello");
		}
	}
	
	public static void main(String... s)
	{
		new Mymenu();
	}
}

/*import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Mymenu implements ActionListener{
	JTextField tf = new JTextField();
	JFrame jf = new JFrame("Mymenu");
	JMenuBar menuBar;
	JMenu menu,submenu;
	JMenuItem menuItem,exit;
	JRadioButtonMenuItem rbMenuItem;
	JCheckBoxMenuItem cbMenuItem;
	Mymenu(){
		jf.add(tf);
		menuBar = new JMenuBar();
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		menuItem = new JMenuItem("A text-only menu item",KeyEvent.VK_T);
		menuItem.addActionListener(this);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1,ActionEvent.ALT_MASK));
		menu.add(menuItem);
		
		menu.addSeparator();
		ButtonGroup group = new ButtonGroup();
		rbMenuItem = new JRadioButtonMenuItem("A radio button menu Item");
		rbMenuItem.setSelected(true);
		rbMenuItem.setMnemonic(KeyEvent.VK_R);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		rbMenuItem = new JRadioButtonMenuItem("Another one");
		rbMenuItem.setMnemonic(KeyEvent.VK_0);
		group.add(rbMenuItem);
		menu.add(rbMenuItem);
		
		menu.addSeparator();
		cbMenuItem = new JCheckBoxMenuItem("A checkBox menu Item");
		cbMenuItem.setMnemonic(KeyEvent.VK_C);
		menu.add(cbMenuItem);
		cbMenuItem = new JCheckBoxMenuItem("Another");
		cbMenuItem.setMnemonic(KeyEvent.VK_H);
		menu.add(cbMenuItem);
		
		menu.addSeparator();
		submenu = new JMenu("A Submenu");
		submenu.setMnemonic(KeyEvent.VK_S);
		menuItem = new JMenuItem("An Item in the submenu");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2,ActionEvent.ALT_MASK));
		submenu.add(menuItem);
		menuItem = new JMenuItem("Another Item");
		submenu.add(menuItem);
		menu.add(submenu);
		exit = new JMenuItem("exit");
		exit.addActionListener(this);
		menu.add(exit);
		
		menu = new JMenu("Another Menu");
		menu.setMnemonic(KeyEvent.VK_N);
		menuBar.add(menu);
		jf.setJMenuBar(menuBar);
		jf.setSize(400,400);
		jf.setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getActionCommand().equals("exit"));
		System.exit(0);
		if(e.getActionCommand().equals("A text-only menu item"))
			tf.setText("hello");
	}
	public static void main(String[] ss){
		new Mymenu();
	}
}
*/