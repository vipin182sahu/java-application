import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class WindowUtilities
{
	public static void setNativeLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.out.println("Error setting Native LAF"+e);
		}
	}
	public static void setJavaLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		}
		catch(Exception e)
		{
			System.out.println("Error setting Java LAF"+e);
		}
	}
	public static void setMotifLookAndFeel()
	{
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
		}
		catch(Exception e)
		{
			System.out.println("Error setting Motif LAF"+e);
		}
	}
}