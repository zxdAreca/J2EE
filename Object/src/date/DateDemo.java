package date;
import java.util.*;
import java.text.*;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d);
		//将模式封装到SimpleDateFormat对象中。
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日E  hh:mm:ss");
		//调用format方法让模式格式化指定Date对象。
		String time = sdf.format(d);
		System.out.println("time"+time);
		
	}

}
