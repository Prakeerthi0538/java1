/*
//Lang Arithmetic Exception....
class Exception1
{
	public static void main(String args[])
	{
		int x=10,y=0;
		System.out.println(x+" "+y);
		int z=x/y;
		System.out.println(z);
		System.out.println("Task completed");
	}
}*/

/*

C:\Users\prake\java1>javac Exception1.java

C:\Users\prake\java1>java Exception1
10 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception1.main(Exception1.java:7)
		
*/

// Exception modification....
class Exception1
{
	public static void main(String args[])
	{
		int x=10,y=0,z=0;
		System.out.println(x+" "+y);
		try
		{
			z=x/y;
		}
		catch(Exception e)
		{
			z=x/2;
			System.out.println("Exception Handleled here");
		}
		System.out.println(z);
		System.out.println("Task completed");
	}
}

/*

C:\Users\prake\java1>javac Exception1.java

C:\Users\prake\java1>java Exception1
10 0
Exception Handleled here
5
Task completed

*/