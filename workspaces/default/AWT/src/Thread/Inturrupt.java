package Thread;
class Thread14 extends Thread{
	Thread14(String s){
		super(s);
	}
	public void run(){
		System.out.println(getName());
		try{
			Thread.sleep(60000*10);
		}catch(Exception e){
			System.out.println("Inturrupted forcely"+e);
		}
		System.out.println(getName()+"dead");
	}
}

class Thread15 extends Thread{
	Thread14 t;
	Thread15(String s,Thread14 t){
		super(s);
		this.t = t;
	}
	public void run(){
		System.out.println(getName());
		t.interrupt();
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		System.out.println(getName() + "dead");
	}
}
public class Inturrupt {
	public static void main(String[] ss){
		Thread14 t1 = new Thread14("Thread1");
		t1.setPriority(10);
		Thread15 t2 = new Thread15("Thread2",t1);
		t1.start();
		t2.start();
	}
}
