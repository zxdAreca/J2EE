package collections_demo;
import java.util.*;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		
		String[] arr = al.toArray(new String[al.size()]);//(new String[5]);
		System.out.println(Arrays.toString(arr));
	}

}
