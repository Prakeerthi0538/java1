// Try with multi catch....
class Exception5
{
	public static void main(String args[])
	{
		int x=10,y,z=0;
		//System.out.println(x+" "+y);
		try
		{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			z=x/y;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Y should not be zero");
			z=x/2;
		}
		catch(NumberFormatException nfe)
		{
			System.out.println("Input should be Integer itself");
		}
		catch(ArrayIndexOutOfBoundsException aiob)
		{
			System.out.println("minimum inputs must be 2..");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handleled here");
		}
		System.out.println(z);
		System.out.println("Task completed");
	}
}

/*

C:\Users\prake\java1>javac Exception5.java

C:\Users\prake\java1>java Exception5 30 3
10
Task completed

C:\Users\prake\java1>java Exception5 30 0
Y should not be zero
15
Task completed

C:\Users\prake\java1>java Exception5 30
minimum inputs must be 2..
0
Task completed

C:\Users\prake\java1>java Exception5 30 A
Input should be Integer itself
0
Task completed

*/