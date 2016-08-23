package Thread;
class Shared{
	int x ;
	synchronized void show(String s, int a){
		x = a; 
		System.out.println("starting in method "+s+" "+x);
		try{
			Thread.sleep(2000);
		}catch(Exception e){}
		System.out.println("exit from method "+s+" " +x);
	}
}

class CustumThread extends Thread{
	Shared s;
	public CustumThread(Shared s, String str){
		super();
		this.s = s;
		start();
	}
	public void run(){
		s.show(Thread.currentThread().getName(), 10);
	}
}

class CustumThread1 extends Thread{
	Shared s;
	public CustumThread1(Shared s, String str){
		super();
		this.s = s;
		start();
	}
	public void run(){
		s.show(Thread.currentThread().getName(), 20);
	}
}

class CustumThread2 extends Thread{
	Shared s;
	public CustumThread2(Shared s, String str){
		super();
		this.s = s;
		start();
	}
	public void run(){
		s.show(Thread.currentThread().getName(), 30);
	}
}


public class RunSync {
	public static void main(String[] ss){
		Shared st = new Shared();
		CustumThread t1 = new CustumThread(st,"one");
		CustumThread1 t2 = new CustumThread1(st,"two");
		CustumThread2 t3 = new CustumThread2(st,"three");
	}
}
