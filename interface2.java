interface factorial
{
	int fact(int n);
}
class Dev1 implements factorial
{
	public int fact(int n)
	{
		int f=1;
		for(int i=0;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}
}
class Dev2 implements factorial
{
	public int fact(int n)
	{
		if(n==1)
			return 1;
		else
			return n*fact(n-1);
	}
	public void showwhoimplemented()
	{
		System.out.println("Keerthi");
	}
}
class mainclass
{
	public static void main(String args[])
	{
		Dev1 d1=new Dev1();
		System.out.println("Inplemented through iteration "+d1.fact(5));
		Dev2 d2=new Dev2();
		System.out.println("Inplemented through Recursion "+d2.fact(5));
		
	}
}