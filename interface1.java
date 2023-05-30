interface interface1
{
	void m1();
	void m2();
	//void m3();
}
class Developer1 implements interface1
{
	public void m1()
	{
		System.out.println("Hello");
	}
	public void m2()
	{
		System.out.println("hlo");
	}
}
class Developer2 extends Developer1
{
	public void m3()
	{
		System.out.println("Keerthi");
	}
}
class mainclass
{
	public static void main(String args[])
	{
		Developer2 d1=new Developer2();
		d1.m1();
		d1.m2();
		d1.m3();
	}
}