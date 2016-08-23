package Thread;
class Threads implements Runnable{
	int x = 10;
	public void run(){
		for(int i=0; i<=10; i++){
			System.out.println(Thread.currentThread().getName());
		}
	} 
}

public class RunThread1 {
	public static void main(String[] ss){
		Threads t1 = new Threads();
		
		Thread tt1 = new Thread(t1,"Thread1");
		tt1.start();
		Thread tt2 = new Thread(t1,"Thread2");
		tt2.start();
	}
}
