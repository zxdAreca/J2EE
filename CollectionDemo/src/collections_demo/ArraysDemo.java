package collections_demo;
import java.util.*;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[] = {2,4,5};
		System.out.println();
		String  []arr ={"aaa","zz","ddh"};
		//把数组变成集合
		List<String> list = Arrays.asList(arr);
		sop("contains :"+list.contains("aaa"));
		sop(list);
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static boolean myContains (String[] arr,String key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x].equals(key))
				return true;
		}
		return false;
	}

}
