package Thread;

class Thread11 extends Thread{
	Demo d = new Demo();
	Thread11(){
	System.out.println(d.add(10,20));
	}
}
class Thread22 extends Thread{
	Demo d = new Demo();
	Thread22(){
	System.out.println(d.add(100,200));
	}
}
class Thread33 extends Thread{
	Demo d = new Demo();
	Thread33(){
	System.out.println(d.add(1000,2000));
	}
}

public class Demo {
	private int x ;
	private int y;
	synchronized int add(int a,int b){
		x=a; 
		y = b;
		return x+y;
	}
	public static void main(String[] ss){
		Thread11 t1 = new Thread11();
		t1.start();
		Thread22 t2 = new Thread22();
		t2.start();
		Thread33 t3 = new Thread33();
		t3.start();
	}
}
