package collection_test;
/*
 * HashSet:无序
 * 每一次添加都有自己的地址值
 * 但地址和元素都相同的时候就不重复添加
 * 不可重复性
 */

import java.util.*;

public class HsahSetDemo {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		
		hs.add("java01");
		hs.add("java02");
		hs.add("java01");
		hs.add("java03");
		hs.add("java04");
		Iterator it =  hs.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
	}

}
