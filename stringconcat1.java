import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("(A)"));
		System.out.println(s1.indexOf('E'));
		System.out.println(s1.lastIndexOf('e'));
		System.out.println(s1.charAt(24));
		System.out.println(s1.equals("aditya engineering college"));
		System.out.println(s1.equalsIgnoreCase("aditya engineering college"));
		System.out.println(s1.substring(7));
		System.out.println(s1.substring(7,18));
		System.out.println(s1.contains("aditya"));
	}
}

/*
output:

26
false
aditya engineering college
ADITYA ENGINEERING COLLEGE
Aditya Engineering college(A)
7
25
g
false
true
Engineering college
Engineering
false

*/