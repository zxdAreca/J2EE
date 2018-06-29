package criculation;
/*
 * 位运算练习
 */

public class Operaton {
//	public Operaton()
//	{
//		System.out.println(Integer.toBinaryString(60));
//	}
////	System.out.println("------------------");
	
	public static void main(String []args)
	{
		int num = 60;
		//获取60的最低四位，通过&15；
		int n1 = num & 15;
		System.out.println((char)(n1-10+'A'));
		
		//要获取下一组四位，蒋60右移四位
		int temp = n1 >>> 4;
		
		//对temp的值进行最低四位的获取
		int n2 = temp & 15;
		System.out.println(n2);
		
	}
}
