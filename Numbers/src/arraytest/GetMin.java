package arraytest;

public class GetMin {
	//��ʽһ
	public static int getMin(int arr[])
	{
		int min = arr[0];
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x] < min)
				min = arr[x];
		}
		return min;
	}
	
	//��ʽ��
	public static int getMin_2(int arr1 [])
	{
		int min = 0;
		for(int y = 0;y<arr1.length;y++)
		{
			if(arr1[y]<arr1[min])
				arr1[min] = arr1[y];
		}
		return min;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[]{-3,-4,-6,-1,0,-7};
		int min = getMin(arr);
		System.out.println(min);
		
		
		int [] arr1 = new int []{2,3,4,5,78,0,-19};
		int min2 = getMin_2(arr1);
		System.out.println(min2);
	}

}
