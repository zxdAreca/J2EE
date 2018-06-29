package collection_test;
/*
 * 往HashSet存入自定义元素
 * 姓名和年龄相同为同一个人，重复元素。 
 * |--hashSet是如何保证元素唯一性的？
 * 		是通过元素的两个方法，hashCode和equals来完成
 * 		如果元素的HashCode值相同，才会判断equals是否为true 
 * 		如果元素的HashCode值不同，不会调用equals。
 * 		
 * 
 */
import java.util.*;
public class HashSetTest {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new Person1("a1",11));
		hs.add(new Person1("a2",12));
		hs.add(new Person1("a3",13));
//		hs.add(new Person1("a4",14));
//		hs.add(new Person1("a1",11));
		
		sop("a1"+hs.contains(new Person("a2",12)));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			Person1 p = (Person1)it.next();		//将Object 向下转型，实用自定义的
			sop(p.getName()+"::"+p.getAge());
		}
		
	}
	
}
class Person1
{
	private String name;
	private int age;
	Person1(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	//自己设定哈希表条件
	public int hashCode()
	{
		System.out.println(this.name+"....hashCode.....");
		return name.hashCode()+age;
	}
	
	//复写equals方法
	public boolean equals(Object obj)
	{

		if(!(obj instanceof Person1))
			return false;

		Person1 p = (Person1)obj;
		System.out.println(this.name+"..equals..."+p.name);

		return this.name.equals(p.name) && this.age == p.age;
	}
	/**/
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
}
