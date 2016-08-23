package Thread;

public class MainThread {
	public static void main(String[] ss){
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		t.setName("Main changed");
		System.out.println(t.getName());
		Thread4 tt = new Thread4("hello");
		tt.start();
	}
}
class Thread4 extends Thread{
	Thread4(String s){
		super(s);
	}
	public void run(){
		for(int i=0; i<=5; i++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
		System.out.println(getName()+"dead");
	}
	//System.out.println("Thread1 calss run completed");
}
