package criculation;

public class Circulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++)
		{
			if(i==3)
			{
				break;
			}
			for(int j=0;j<6;j++)
			{
				if(j==4)
				{
					break;
				}
				System.out.println("i=" + i + "j=" + j);
			}
		}
	}

}
