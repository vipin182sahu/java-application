package Thread;
class Shared1{
	int flag = 0;
	int data = 0;
	synchronized public void submit(){
		flag = 1; 
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println("value submitted");
			notify();
		}
	}
	synchronized int withdraw(){
		if(flag ==0){
			try{
				System.out.println("wait block");
			}catch(Exception e){}
			
		}
		return data;
	}
}
public class RunSync1 {
	public static void main(String[] ss){
		Shared1 st = new Shared1();
		
		Thread12 t = new Thread12(st,"one");
		Thread13 t1 = new Thread13(st,"two");
	}
}

class Thread12 extends Thread{
	Shared1 s;
	Thread12(Shared1 s, String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		s.withdraw();
	}
}
class Thread13 extends Thread{
	Shared1 s;
	Thread13(Shared1 s, String str){
		super(str);
		this.s = s;
		start();
	}
	public void run(){
		s.submit();
	}
}