package Generic;
class stats <T extends Number>{
	T []nums;
	stats(T []o){
		nums = o;
	}
	
	double average(){
		double sum = 0.0;
		for(int i= 0; i<nums.length; i++){
			sum+= nums[i].doubleValue();
			
		}
		return sum/nums.length;
	}
}
public class BoundsDemo {
	public static void main(String[] ss){
		Integer inums[]={1,2,3,4,5};
		stats<Integer> i = new stats<Integer>(inums);
		double v = i.average();
		System.out.println("integer aberage is:"+v);
		
		Double dnums[]={1.1,2.2,3.3,4.4,5.5};
		stats<Double> d = new stats<Double>(dnums);
		double v1 = i.average();
		System.out.println("double aberage is:"+v1);
		
		/*String snums[] ={"a"};
		stats<String> s = new stats<String>(snums);
		String v2 = s.average();
		System.out.println("string aberage is:"+v2);*/
		
	}
}
