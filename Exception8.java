import java.util.*;
class Exception8{
	public static int division(int x,int y)throws ArithmeticException
	{
		int z=0;
		z=x/y;
		return z;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int m,n,result=0;
		m=sc.nextInt();
		n=sc.nextInt();
		try
		{
			result=division(m,n);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dashara");
		}
		System.out.println(result);
		System.out.println("Task completed");
	}
}
/*

C:\Users\prake\java1>javac Exception8.java

C:\Users\prake\java1>java Exception8
10
0
Dashara
0
Task completed

C:\Users\prake\java1>java Exception8
10
5
2
Task completed

*/