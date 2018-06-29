package collections_demo;

public class PrameMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3};
		show(arr);
		showIs(1,2,3,4);
//		show(1,2);
		showa(1,"ff","jfjf");
	}
	/*
	public static void show(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	*/
	public static void show(int arr[])
	{
		System.out.println(arr);
	}
	public static void showIs(int... arr)
	{
		System.out.println(arr);
	}
	public static void showa(int arr,String... aee)
	{
		System.out.println(arr+"::"+aee.length);
	}

}
