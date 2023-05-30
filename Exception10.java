import java.util.Scanner;
class NegativevalException extends Exception
{
	public NegativevalException()
	{
		super();
	}
	public NegativevalException(String message)
	{
		super(message);
	}
}
class OutofRangeException extends Exception
{
	public OutofRangeException()
	{
		super();
	}
	public OutofRangeException(String msg)
	{
		super(msg);
	}
}
class StudentMarks
{
	public static void main(String args[])
	{
		int s=0,i,n;		
		int sub[]=new int[n];
		float avg;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		try
		{
			for(i=0;i<n;i++)
			{
				sub[i]=sc.nextInt();
				if(sub[i]<0)
					throw new NegativevalException("There is no negative marking");
				else if(sub[i]>100)
					throw new OutofRangeException("The range of marks should be below 100");
				else
				{
					s+=sub[i];
				}
			}
			avg=(float)s/n;
		}
		catch(NegativevalException ne)
		{
			System.out.println(ne);
		}
		catch(OutofRangeException oe)
		{
			System.out.println(oe);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			sc.close();
		}
		System.out.println("Total marks:"+s);
		System.out.println("Average marks:"+avg);
	}
}

/*

C:\Users\prake\java1>javac Exception10.java

C:\Users\prake\java1>java StudentMarks
5
-12 13 45 87 98
NegativevalException: There is no negative marking

C:\Users\prake\java1>java StudentMarks
5
101 29 37 84 95
OutofRangeException: The range of marks should be below 100

C:\Users\prake\java1>java StudentMarks
5
98 99 97 96 100
Total marks:490
Average marks:98.0

*/