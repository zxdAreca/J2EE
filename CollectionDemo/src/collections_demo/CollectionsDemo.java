package collections_demo;
import java.util.*;


//按照长度比较的比较器
class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}


//反转的比较器
class StrComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		/*
		int num = s1.compareTo(s2);
		if(num>0)
			return -1;
		if(num<0)
			return 1;
		return num;
		*/
		return s2.compareTo(s1);
	}
}
public class CollectionsDemo {

	public static void main(String[] args) {
		orderDemo();

	}
	public static void orderDemo()
	{
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenComparator()));//(Collections.reverseOrder());//new StrComparator());
		ts.add("aa");
		ts.add("abcd"); 
		ts.add("k");
		ts.add("zxd");
		
		//自然排序
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
