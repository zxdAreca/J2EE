package collections_demo;
import java.util.*;

public class CollectionsDemo2 {
	
	//折半查找原理
	public static int halfSearch(List<String> list,String key)
	{
		int max,min,mid;
		max = list.size()-1;
		min = 0;
		
		while(min<max)
		{
			mid = (max+min)>>1;		//  /2
			String str = list.get(mid);
			int num = str.compareTo(key);
			if(num>0)
				return max = mid-1;
			else if(num<0)
				min = mid+1;
			else
				return mid;
		}
		return -min-1;
	}
	public static void replaceAllDemo()
	{
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("abcd");
		list.add("kk");
		list.add("zz");
		sop(list);
		
//		Collections.replaceAll(list, "aaa", "pp");
//		sop(list);
//		Collections.reverse(list);
		Collections.swap(list, 1, 2);		//只能对List集合操作，因为角标，改变元素位置。
		sop(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------");
		replaceAllDemo();
		System.out.println("-------------------");

		
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("abcd");
		list.add("kk");
		list.add("zz");
		int index = halfSearch(list,"kk"); 
		sop("index"+index);
		sop(list);
		Collections.fill(list, "pp");
		sop(list);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
