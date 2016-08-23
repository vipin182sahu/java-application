package Thread;
import java.util.*;
import java.awt.*;
class Task extends TimerTask{
	int count = 1;
	public void run(){
		Frame f = new Frame();
		f.setSize(200,200);
		f.setVisible(true);
	}
}
public class TaskScheduling {
	public static void main(String[] ss){
		Timer timer = new Timer();
		int delay = 5000;
		int period = 1000;
		timer.scheduleAtFixedRate(new Task(), 10, 100);
	}
}
