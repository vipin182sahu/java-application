package Generic;
class GenCons{
	private double val;
	<T extends Number> GenCons(T arg){
		val = arg.doubleValue();
	}
	void showAll(){
		System.out.println("val:"+val);
	}
}
public class GenConsDemo {
	public static void main(String[] ss){
		//GenCons test1 = new GenCons("a");
		GenCons test = new GenCons(100);
		GenCons test1 = new GenCons(123.5f);
		test.showAll();
		test1.showAll();
	}
}
