package duotai_test;
abstract class Animals
{
	abstract public void eat();
}
class Cat extends Animals
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
}
class Dog extends Animals
{
	public void eat()
	{
		System.out.println("����");
	}
	public void kanJia()
	{
		System.out.println("����");
	}
	
}
class Pig
{
	public void eat()
	{
		System.out.println("������");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}
class DemoTest
{
	public static void main(String []args)
	{
//		Cat c = new Cat();
//		c.eat();
//		c.catchMouse();
//		function(new Cat());
		Animals a  = new Cat();
		a.eat();
	}
	public static void function(Cat c)
	{
		c.catchMouse();
	}
}

