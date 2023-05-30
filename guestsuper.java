//Using super()....... it is executed automatically....compiler takes the responsibility
class A
{
	public A()
	{
		System.out.println("A Constructor");
	}
}
class B extends A
{
	public B()
	{
		super();
		System.out.println("B Constructor");
	}
}
class maincls
{
	public static void main(String args[])
	{
		B b=new B();
	}
}
