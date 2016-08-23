package Thread;

class Threads1 extends Thread{
	Threads1(String s){
		super(s);
	}
	public void run(){
		for(int i =0 ; i<=5 ; i++){
			System.out.println(getName());
		}
	}
}
class Threads2 extends Thread{
	Threads2(String s){
		super(s);
	}
	public void run(){
		for(int i =0 ; i<=10 ; i++){
			System.out.println(getName());
		}
	}
}
class Threads3 extends Thread{
	Threads3(String s){
		super(s);
	}
	public void run(){
		for(int i =0 ; i<=15 ; i++){
			System.out.println(getName());
		}
	}
}

public class RunThreadDaemon {
	public static void main(String[] ss){
		Threads1 t1 = new Threads1("Threads1");
		Threads2 t2 = new Threads2("Threads2");
		Threads3 t3 = new Threads3("Threads3");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start(); t2.start(); t3.start();
		for(int i =0; i<=20; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}
}
