class parent 
{
	public void show()
	{
		System.out.println("Gangleader");
	}
}
class child extends parent
{
	public void show()
	{
		super.show();
		System.out.println("RRR");
	}
}
class maincls
{
	public static void main(String args[])
	{
		child c=new child();
		c.show();
	}
}