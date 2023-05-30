class Exception6
{
	public static void main(String args[])
	{
		int x=10,y=2,z=0;
		try
		{
			z=x/y;
		}
		catch (ArithmeticException e)
		{
			System.out.println("Y value should be non Zero");
			z=x/2;
		}
		finally
		{
			//cleaning code..
			System.out.println("FInally should be executed irrespectively");
		}
		System.out.println(z);
		System.out.println("Task completed");
	}
}

/*
C:\Users\prake\java1>javac Exception6.java

C:\Users\prake\java1>java Exception6
FInally should be executed irrespectively
5
Task completed
*/