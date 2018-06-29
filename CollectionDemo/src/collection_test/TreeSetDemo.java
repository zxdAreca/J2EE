package collection_test;
/*
 * |-- TreeSet 可以对Set集合中的元素排序 
 * 
 * 
 * 需求：
 * 往TreeSet集合中存储自定义对象学生
 * 想按照学生的年龄进行排序。
 * 
 */
import java.util.*;

public class TreeSetDemo {
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts = new TreeSet();
		ts.add(new StedentA("lisi02",22));
		ts.add(new StedentA("lisi007",20));
		ts.add(new StedentA("lisi",19));
		ts.add(new StedentA("lisi",40));
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			StedentA stu = (StedentA)it.next();
			sop(stu.getName()+stu.getAge());
		}
	}
	
}
//实现Comparable接口，自定义compareTo方法
class StedentA implements Comparable
{
	private String name;
	private int age;
	StedentA(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public int compareTo(Object obj)
	{
		if(!(obj instanceof StedentA))
			throw new RuntimeException("不是学生对象");
		StedentA s = (StedentA) obj;
		System.out.println(this.name+"..."+s.name);
		if(this.age>s.age)
			return 1;
		if(this.age==s.age)
		{
			//但年龄相同的时候比较姓名
			return this.name.compareTo(s.name);
		}
		return -1;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
}


