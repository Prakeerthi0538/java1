interface i1
{
	void m1();
	void m2();
}
interface i2
{
	void m2();
	void m3();
}
class sample implements i1,i2
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
	public void m3()
	{
		System.out.println("M3 method");
	}
}
class sample implements i1,i2
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
	public void m3()
	{
		System.out.println("M3 method");
	}
}