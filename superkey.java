class A
{
	int x=10;
	public void show()
	{
		System.out.println("A: "+x);
	}
}
class B extends A
{
	int x=20;
	public void display()
	{
		System.out.println("A: "+super.x);
		System.out.println("B: "+x);
	}
}
class C extends A//10    30    if(C extends B ==>  20    30)
{
	int x=30;
	public void display1()
	{
		System.out.println("A: "+super.x);
		System.out.println("C: "+x);
	}
}

class maincls
{
	public static void main(String args[])
	{
		C c=new C();
		c.display1();
	}
}
		