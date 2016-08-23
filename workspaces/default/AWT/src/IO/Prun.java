package IO;
import java.io.*;
import java.util.*;

class Poutput implements Runnable{
	PipedOutputStream pout;
	Poutput(PipedOutputStream pout){
		this.pout = pout;
	}
	public void run(){
		for(int i=65; i<=91; i++){
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){}
		}
	}
}
class Pinput implements Runnable{
	PipedInputStream pin;
	Pinput(PipedInputStream pin){
		this.pin = pin;
	}
	public void run(){
		int z= 0;
		for(int i =65; i<=91;i++){
			try{
				z= pin.read();
			}catch(Exception e){
				System.out.println((char)z);
			}
		}
	}
}

public class Prun {
	public static void main(String[] ss) throws IOException{
		PipedOutputStream pout = new PipedOutputStream();
		PipedInputStream pin = new PipedInputStream();
		pout.connect(pin);
		Poutput po = new Poutput(pout);
		Pinput pi = new Pinput(pin);
		
		Thread t1 = new Thread(po);
		Thread t2 = new Thread();
		t1.start();
		t2.start();
	}
}
