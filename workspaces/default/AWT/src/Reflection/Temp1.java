package Reflection;

class PrivateObject{
	private String privateString = null;
	public PrivateObject(String privaeString){
		this.privateString = privateString;
	}
	private String getPrivateString(){
		return this.privateString;
	}
} 

public class Temp1 {
	public static void main(String[] ss) throws Exception{
		PrivateObject privateObject = new PrivateObject("the private value");
		Class c = int.class;
		System.out.println(c.getName());
		java.lang.reflect.Method privateStringMethod= PrivateObject.class.getDeclaredMethod("getprivateString",null);
		privateStringMethod.setAccessible(true);
		String returnValue = (String)privateStringMethod.invoke(privateObject,null);
		System.out.println("return Value="+returnValue);
	}
}

