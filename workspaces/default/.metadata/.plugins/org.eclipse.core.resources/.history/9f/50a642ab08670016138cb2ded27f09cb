 
import java.awt.*;
import java.lang.reflect.*;

class privateObject{
	private String privateString = null;
	public privateObject(String privateString){
		this.privateString = privateString;
	}
	
}
public class Temp {
	public static void mian(String[] ss) throws Exception{
		privateObject po = new privateObject("the private value");
		Class c = privateObject.class.getClass();
		Field privateStringField = c.getDeclaredField("privateString");
		privateStringField.setAccessible(true);
		String fieldValue = (String) privateStringField.get(po);
		System.out.println("fieldValue="+fieldValue);
		
	}
}


