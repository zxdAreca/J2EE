package collection_test;
import java.util.*;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map = new HashMap<String,String>();
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		map.put("04", "zhangsan4");
		
		Set<String> keySet = map.keySet();
		
		Iterator<String> it = keySet.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			
			//获取到了键值可以通过集合中的get方法获取气对应的值。
			String value = map.get(key);
			System.out.println("key :"+key+",value:"+value);
			
		}
	}

}
