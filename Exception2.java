/*
//Array Index out of bound Exception...
class Exception2
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40};
		for(int i=0;i<=x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("Task completed");
	}
}
*/
/*

C:\Users\prake\java1>javac Exception2.java

C:\Users\prake\java1>java Exception2
10
20
30
40
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
        at Exception2.main(Exception2.java:9)

*/

// Exception modification....
class Exception2
{
	public static void main(String args[])
	{
		int x[]={10,20,30,40};
		try
		{
			for(int i=0;i<=x.length;i++)
			{
				System.out.println(x[i]);
			}
		}
		catch(Exception e)
		{
			System.out.println("Index value crossed the range..");
		}
		System.out.println("Task completed");
	}
}

/*

C:\Users\prake\java1>javac Exception2.java

C:\Users\prake\java1>java Exception2
10
20
30
40
Index value crossed the range..
Task completed

*/