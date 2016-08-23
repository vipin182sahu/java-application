package Applet;

public class EventTest {

	public EventTest(){
		
	}
	
	public interface DataChangeListener{
		
		void onDataChange(String msg);
		
	}
	
	public static DataChangeListener listener;
	
	
	public void setDataChangeListener(DataChangeListener listener){
		this.listener = listener;
	}
	
	public static void main(String[] ar){
		
		
		new EventTest().new Subscriber().subscribe();
		
		
		for(int i = 0 ; i<10;i++){
			if (i==5){	
				
			listener.onDataChange("Your Data has a change ");
			
			}
			System.out.println(i);
		}
		
		
		
		
	}
	
	
	class Subscriber{
		
		public Subscriber(){
			
		}
		
		public void subscribe(){
			
				EventTest.DataChangeListener list = new EventTest.DataChangeListener(){
				@Override
				public void onDataChange(String msg) {
					System.out.print("message rec = "+msg);
					
				}
			};
			
			new EventTest().setDataChangeListener(list);
			
			
			
		}
		
		
	}
	
}
