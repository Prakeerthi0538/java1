/*// String Index out of bound Exception.....
class Exception3
{
	public static void main(String args[])
	{
		String s= "Aditya";
		System.out.println(s.charAt(10));
		System.out.println("Task completed");
	}
}*/

/*

C:\Users\prake\java1>javac Exception3.java

C:\Users\prake\java1>java Exception3
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 10 out of bounds for length 6
        at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)
        at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:52)
        at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:213)
        at java.base/jdk.internal.util.Preconditions$4.apply(Preconditions.java:210)
        at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:98)
        at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
        at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
        at java.base/java.lang.String.checkIndex(String.java:4570)
        at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:46)
        at java.base/java.lang.String.charAt(String.java:1527)
        at Exception3.main(Exception3.java:7)

*/

// Exception modification....
class Exception3
{
	public static void main(String args[])
	{
		String s= "Aditya";
		try
		{
			System.out.println(s.charAt(10));
		}
		catch(Exception e)
		{
			System.out.println("Index number should not crossed out of length");
		}
		System.out.println("Task completed");
	}
}

/*


C:\Users\prake\java1>javac Exception3.java

C:\Users\prake\java1>java Exception3
Index number should not crossed out of length
Task completed

*/