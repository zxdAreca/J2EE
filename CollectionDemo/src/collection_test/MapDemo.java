package collection_test;
import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<>();
		map.put("01","李同学");
		map.put("02","魏同学");
		Set<String> set = map.keySet();					//创建Map集合中所有Key对象的集合
		Iterator <String> it = set.iterator();			//创建集合迭代器
		System.out.println("key集合中的的元素：");
		while(it.hasNext())							//遍历集合
		{
			System.out.println(it.next());
		}
		Collection <String> coll =map.values();
		it = coll.iterator();
		System.out.println("Values 集合中的元素：");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
