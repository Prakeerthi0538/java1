// METHOD OVERRIDING ......
class parent
{
	public void display()
	{
		System.out.println("Welcome to THUB");
	}
}
class child extends parent
{
	public void display()
	{
		System.out.println("Hi! Good to see you in THUB");
	}
}
class main
{
	public static void main(String args[])
	{
		parent p=new parent();
		p.display();
		child c=new child();
		c.display();
	}
}