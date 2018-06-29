package day18;
import java.util.*;
public class SystemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = System.getProperties();
		for(Object obj : prop.keySet())
		{
			String value = (String)prop.get(obj);
			System.out.println(obj+"::"+value);
		}
		//在系统中自定义一些特有信息
		System.setProperty("mykey","myvalue");
		
		
		//获取指定属性信息
		String value2 = System.getProperty("os.name");
		System.out.println("value:"+value2);
	}

}
