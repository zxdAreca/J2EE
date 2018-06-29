package date;
import java.util.*;
import java.text.*;
public class CalendarDemo {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		sop(c.get(Calendar.YEAR)+"年");
		
	}

}
