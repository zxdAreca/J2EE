package duotai_test;
abstract class Animals
{
	abstract public void eat();
}
class Cat extends Animals
{
	public void eat()
	{
		System.out.println("吃鱼");
	}
	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}
class Dog extends Animals
{
	public void eat()
	{
		System.out.println("吃肉");
	}
	public void kanJia()
	{
		System.out.println("看家");
	}
	
}
class Pig
{
	public void eat()
	{
		System.out.println("吃饲料");
	}
	public void gongDi()
	{
		System.out.println("拱地");
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

