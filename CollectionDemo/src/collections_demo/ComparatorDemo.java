package collections_demo;

import java.util.*;

//比较器
class StrLenComparatorA implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
		//return s2.compareTo(s1);
	}
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	

}
