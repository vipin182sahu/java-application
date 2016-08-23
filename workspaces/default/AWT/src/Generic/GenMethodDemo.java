package Generic;

public class GenMethodDemo {
	static <T,V extends T>boolean isIn(T x,V []y){
		for(int i =0;i<y.length;i++)
			if(x.equals(y[i]))
			return true;
			return false;	 
	}
	static <T extends Number>double add(T x,T y){
		double d = x.doubleValue() +y.doubleValue();
		return d;
	}
	public static void main(String[] ss){
		Integer nums[] = {1,2,3,4,5};
		if(isIn(2,nums))
			System.out.println("2 is in nums");
		if(!isIn(7,nums))
			System.out.println("7 is not in nums");
		String str[] = {"one","two","three"};
		if(isIn("two",str))
			System.out.println("two is in str");
		if(!isIn("seven",str))
			System.out.println("sever is not in str");
		System.out.println(add(10,29));
		System.out.println(add(12.3f,29.4f));
	}
}
