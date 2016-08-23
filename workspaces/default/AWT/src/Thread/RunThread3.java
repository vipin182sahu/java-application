package Thread;
class Thread5 implements Runnable{
	
	int x;
	public void run(){
		for(int i = 1; i<=5; i++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(100);
			}catch(Exception e){}
		}
	}
}

public class RunThread3 {
	public static void main(String[] ss){
		Thread5 t1 = new Thread5();
		t1.x= 50;
		
		Thread tt1 = new Thread(t1,"thread1");
		tt1.start();
		Thread5 t2 = new Thread5();
		t2.x= 100;
		Thread tt2 = new Thread(t1,"thread2");
		tt2.start();
		
		/*try{
			tt1.join(1000);
			tt2.join(1000);
		}catch(Exception e){}*/
		//tt1.setPriority(Thread.MAX_PRIORITY);
		//tt1.suspend();
		//tt2.suspend();  //first stop 
		//tt2.resume();		//then resume the thread
		//tt2.stop();
		//System.out.println(tt1.isAlive());
		
		for(int i = 1; i<=15; i++){
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}
}
