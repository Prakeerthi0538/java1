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
class child2 extends child1
{
	int z=30;
	public void displayZ()
	{
		System.out.println(z);
	}
}
class multilevel
{
	public static void main(String args[])
	{
		parent p=new parent();
		p.displayX();
		child1 c1=new child1();
		c1.displayX();
		c1.displayY();
		child2 c2=new child2();
		c2.displayX();
		c2.displayZ();
	}
}
