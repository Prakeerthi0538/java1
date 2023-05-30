import java.util.Scanner;
class TooyoungException extends Exception
{
	public TooyoungException()
	{
		super();
	}
	public TooyoungException(String message)
	{
		super(message);
	}
}
class ToooldException extends RuntimeException
{
	public ToooldException()
	{
		super();
	}
	public ToooldException(String msg)
	{
		super(msg);
	}
}
class MarriageDemo
{
	public static void main(String args[])
	{
		int age;
		Scanner sc=new Scanner(System.in);
		try
		{
			age=sc.nextInt();
			if(age<18)
				throw new TooyoungException("Minimum Age required for marriage is 21");
			else if(age>40)
				throw new ToooldException("You are too late");
			else
				System.out.println("YOu are eligible for marriage");
		}
		catch(TooyoungException te)
		{
			System.out.println(te);
		}
		catch(ToooldException to)
		{
			System.out.println(to);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
	}
}

/*

C:\Users\prake\java1>java MarriageDemo
16
TooyoungException: Minimum Age required for marriage is 21

C:\Users\prake\java1>java MarriageDemo
21
YOu are eligible for marriage

C:\Users\prake\java1>java MarriageDemo
45
ToooldException: You are too late

C:\Users\prake\java1>java MarriageDemo
Keerthi
java.util.InputMismatchException

*/