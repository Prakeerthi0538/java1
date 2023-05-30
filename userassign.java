import java.util.Scanner;
import pack.modules.stringpractice;
class userassign
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		stringpractice s1=new stringpractice();
		String s=sc.nextLine();
		System.out.println(s1.strreverse(s));
		System.out.println(s1.strpalindrome(s));
		//System.out.println(s1.strvowels(s));
	}
}

/*


C:\Users\prake\java1>javac -d c:\users\prake\java1. stringpractice.java

C:\Users\prake\java1>set classpath=;.;%c:\users\prake\java1%; c:\users\prake\java1;

C:\Users\prake\java1>javac userassign.java

C:\Users\prake\java1>java userassign
Prakeerthi
ihtreekarP
false

*/