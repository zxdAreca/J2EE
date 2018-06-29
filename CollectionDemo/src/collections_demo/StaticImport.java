package collections_demo;
/*
 * StaticImport静态导入
 * 
 * 当类名重复的时候，需要指定具体的报名
 * 当方法名重复，需要指定具备所属的对象或者类。
 * 
 */
import static java.util.Arrays.*;		//导入
import java.util.Arrays;
import static java.lang.System.*;			//导入System类 中所有的静态成员。

public class StaticImport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		out.println("haha");
		int arr[] = {3,1,6};
		sort(arr);  
		//Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, 1);
		System.out.println(index);
		System.out.println(Arrays.toString(arr));
		
	}

}
