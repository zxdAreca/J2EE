package collection_test;		
import java.util.*;				//导包
public class Muster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection <String>list = new ArrayList();	//实例化集合列对象
		list.add("a");
		list.add("b");
		list.add("c");
		Iterator<String>it = list.iterator();		//创建迭代器
		while(it.hasNext())							//判断是否又下一个元素
		{
			String str = (String)it.next();			//获取集合中元素
			System.out.println(str); 
		}
		
		
	}

}
