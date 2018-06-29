package collection_test;
import java.util.*;

public class MapTest1 {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		
		//添加元素，添加元素时，如果出现相同的键，那么后面的添加的键会覆盖原有键对应值，而且put会返回被覆盖的值
//		sop("put"+map.put("01", "zhangsan1"));
//		sop("put"+map.put("01", "zhangsan2"));
//		sop("put"+map.put("02", "zhangsan3"));
//		sop("put"+map.put("03", "zhangsan4"));
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		sop("remove"+map.remove("02"));
		sop("get"+map.get("03"));
		map.put("04", null);
		sop("get判断"+map.get("04"));
		
		//获取map集合中所有的值
		Collection <String> coll = map.values();
		
		System.out.println(coll);
		sop(map);
		
		

	}

}
