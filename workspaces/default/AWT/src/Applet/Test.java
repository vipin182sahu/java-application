package Applet;
import java.util.*;

public class Test {
	
	
	class Maths {
		
		private int sum = 0 ;
		
		public Maths(){
			
		}
		public Maths add(int n){
			this.sum +=n;
			return this;
		}
		
		public int getSum(){
			return this.sum;
		}
		
	}
	
	 public static void main(String[] aa){
		
		 int result = new Test().new Maths()
		 		.add(2)
		 		.add(3)
		 		.add(222)
		 		.add(5)
		 		.add(6).getSum();
		 

		 System.out.print(result);
		 
	 }
}