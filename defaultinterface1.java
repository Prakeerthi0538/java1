/*DEFAULT METHOD
----------------------------*/
interface I1
{
	void m1();
	void m2();
	default void m3()
	{
		System.out.println("Default method");
	}
}
class provider1 implements I1
{
	public void m1()
	{
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
	}
}
class provider2  implements I1
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
		System.out.println("My own Definition");
	}
}
class mainclass
{
	public static void main(String args[])
	{
		I1 i=new provider1();
		i.m1();
		i.m2();
		i.m3();

		I1 p= new provider2();
		p.m1();
		p.m2();
		p.m3();
	}
}



/*
output:
---------
M1 method
M2 method
Default method
M1 method
M2 method
My own Definition
*/