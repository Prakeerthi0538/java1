class Test
{
	int x=10;
	public void show()
	{
		System.out.println("KGF");
	}
}
class Exception7
{
	public static void main(String args[])
	{
		//Test t=new Test();
		Test t=null;
		try
		{
			t.show();
		}
		catch(NullPointerException ne)
		{
			System.out.println("Before accessing properties we should allocate the memory for objects");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("RRR");
		}
		System.out.println("Task completed");
	}
}