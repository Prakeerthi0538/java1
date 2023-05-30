/*//Number format Exception....
class Exception4
{
	public static void main(String args[])
	{
		int age=Integer.parseInt(args[0]);
		System.out.println("Your age = "+age);
		System.out.println("Task completed");
	}
}
*/
/*

C:\Users\prake\java1>javac Exception4.java

C:\Users\prake\java1>java Exception4 thub
Exception in thread "main" java.lang.NumberFormatException: For input string: "thub"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:665)
        at java.base/java.lang.Integer.parseInt(Integer.java:781)
        at Exception4.main(Exception4.java:6)

*/

// Exception modification....
class Exception4
{
	public static void main(String args[])
	{
		int age=0;
		try
		{
			age=Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Input should be Integer itself");
		}
		System.out.println("Your age = "+age);
		System.out.println("Task completed");
	}
}

/*

C:\Users\prake\java1>javac Exception4.java

C:\Users\prake\java1>java Exception4 thub
Input should be Integer itself
Your age = 0
Task completed

*/