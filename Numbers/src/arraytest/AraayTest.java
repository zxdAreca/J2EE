package arraytest;
/*
 * ��ȡ���ֵ��ʽ
 * �˴���ȡ����int�͵ģ������ȡ�����������͵ģ������ص���ʽ��ȡ��
 */
public class AraayTest
{
	//��ʽһ
	public static int getMax(int []arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >max)
				max = arr[i];
		}
		return max;
	}
	
	//��ʽ��
	/*
	 * �ɲ����Խ���ʱ������ʼ��Ϊ0��
	 * ���ԣ����ַ�ʽ����ʵ���ڳ�ʼ�������е�����һ���Ǳꡣ
	 */
	public static int getMax_2(int []arr)
	{
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >arr[max])
				arr[max] = arr[i];
		}
		return arr[max];
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr [] = new int[]{-5,-1,-3,-4,-56,-6};
		int max = getMax(arr);
		int max2 = getMax_2(arr);

		System.out.println("max="+max);
		System.out.println("max2="+max2);
	}

}
