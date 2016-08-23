package Generic;
class Gen1<T extends Number>{
	T ob;
	T vals[];
	Gen1(T o,T []nums){
		ob = o;
		vals = nums;
	}
}
public class genArrays {
	public static void main(String[] ss){
		Integer n[]={1,2,3,4,5};
		Gen1<?> gens[] = new Gen1<?>[10];
		gens[0]= new Gen1<Integer>(10,n);
		gens[1]= new Gen1<Float>(2.3f,new Float[]{1.2f});
		for(int i = 0; i<gens[0].vals.length;i++){
			System.out.println(gens[0].vals[i]);
		}
	}
}
