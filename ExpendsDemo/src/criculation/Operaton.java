package criculation;
/*
 * λ������ϰ
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
		//��ȡ60�������λ��ͨ��&15��
		int n1 = num & 15;
		System.out.println((char)(n1-10+'A'));
		
		//Ҫ��ȡ��һ����λ����60������λ
		int temp = n1 >>> 4;
		
		//��temp��ֵ���������λ�Ļ�ȡ
		int n2 = temp & 15;
		System.out.println(n2);
		
	}
}
