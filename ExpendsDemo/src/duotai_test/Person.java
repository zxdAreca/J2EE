package duotai_test;
class Car
{
	public Car(int num)
	{
		System.out.print("����"+num);
	}
	public Car(String color)
	{
		System.out.println("������ɫ" + color);
	}
	public Car()
	{
		
	}
	
}

class Hello
{
	public Hello()
	{
		System.out.println("ʵ��");
	}
}
class Person
{
	public Person(String n,int a)
	{ //���췽�� 
		name = n; 
		age = a;
		System.out.println(n+"����"+a);
	}
	private String name;
	private int age;
	public static void main(String[] args)
	{
		Person p = new Person("����",14);//���������
		Hello b = new Hello();
		Car c = new Car(4);
		Car d = new Car("red");
		int num1 = 60;
		int n1 = num1 & 15;
		System.out.println((char)(n1-10+'A'));		
		int temp = 60 >>4;
		int n2 = temp & 15;
		System.out.println(n2);
		System.out.println("5+5="+5+5);
		int [][]arr = {{3,8,2},{2,7},{9,0,1,6}};
		System.out.println(arr[1][1]);
		
		
	}
}