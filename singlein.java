class parent
{
	int x=10;
	public void displayX()
	{	
		System.out.println(x);
	}
}
class child1 extends parent
{
	int y=20;
	public void displayY()
	{
		System.out.println(y);
	}
}
class single
{
	public static void main(String args[])
	{
		parent p=new parent();
		p.displayX();
		child1 c1=new child1();
		c1.displayX();
		c1.displayY();
	}
}
	