package collection_test;


/*
每一个学生都有对应的归属地。
学生Student，地址String。
学生属性：姓名，年龄。
注意：姓名和年龄相同的视为同一个学生。
保证学生的唯一性。



1，描述学生。

2，定义map容器。将学生作为键，地址作为值。存入。

3，获取map集合中的元素。

*/

import java.util.*;
class StudentA	 implements Comparable<StudentA>
{
	private String name;
	private int age;
	StudentA(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(StudentA s)
	{
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}

	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof StudentA))
			throw new ClassCastException("类型不匹配");

		StudentA s = (StudentA)obj;

		return this.name.equals(s.name) && this.age==s.age;
		

	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+":"+age;
	}
}



class  MapDemo1
{
	public static void main(String[] args) 
	{
		HashMap<StudentA,String> hm = new HashMap<StudentA,String>();

		hm.put(new StudentA("lisi1",21),"beijing");
		hm.put(new StudentA("lisi1",21),"tianjin");
		hm.put(new StudentA("lisi2",22),"shanghai");
		hm.put(new StudentA("lisi3",23),"nanjing");
		hm.put(new StudentA("lisi4",24),"wuhan");

		//第一种取出方式 keySet

		Set<StudentA> keySet = hm.keySet();

		Iterator<StudentA> it = keySet.iterator();

		while(it.hasNext())
		{
			StudentA stu = it.next();
			String addr = hm.get(stu);
			System.out.println(stu+".."+addr);
		}


		//第二种取出方式 entrySet
		Set<Map.Entry<StudentA,String>> entrySet = hm.entrySet();

		Iterator<Map.Entry<StudentA,String>> iter = entrySet.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry<StudentA,String> me = iter.next();
			StudentA stu = me.getKey();
			String addr = me.getValue();
			System.out.println(stu+"........."+addr);
		}
	}
}
