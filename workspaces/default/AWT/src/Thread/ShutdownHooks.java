package Thread;
import java.awt.*;
import javax.swing.*;
public class ShutdownHooks implements Runnable{
	public void run(){
		System.out.println("*** Shutdown Hook started ***");
		System.out.println("*** Application shuttin down");
		try{
			Thread.sleep(5000);
		}catch(Exception e){}

	}
	public static void main(String[] ss){
		Runtime runTime = Runtime.getRuntime();
		ShutdownHooks hook = new ShutdownHooks();
		
		runTime.addShutdownHook(new Thread(hook));
		
		JFrame testFrame = new JFrame("testFrame");
		testFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		testFrame.setSize(400,400);
		testFrame.setVisible(true);
		System.out.println("hello");
		
	}
}
