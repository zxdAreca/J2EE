package collection_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Gather {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		//List<String>list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		int i = (int)(Math.random()*list.size());			//获取0~2之间的随机数
		System.out.println("随机获取数组中的元素： " + list.get(i));
		list.remove(2);			//将指定索引位置的元素从集合移除
		System.out.println("将索引是‘2’的元素从数组移除后，数组的元素是: ");
		//获取元素的几种方式
		
		for(int j=0;j<list.size();j++)						//循环遍历集合
		{
			System.out.println(list.get(j));
		}
		//通过迭代器获取元素
		/*
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			sop("Next"+it.next());
		}
		*/
		
		ListIterator li = list.listIterator();
		sop("hasNext="+li.hasNext());
		sop("hasPrevious="+li.hasPrevious());
		while(li.hasNext())
		{
			Object obj = li.next();
			if(obj.equals("b"))
				// li.add("java09");
			li.set("B");
			
		}
		sop("hasNext="+li.hasNext());

		sop("hasPrevious="+li.hasPrevious());

		sop(list);
		
	}

}
