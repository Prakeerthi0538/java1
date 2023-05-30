import java.util.Scanner;
import pack.modules.Number1;
class userpack1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Number1 obj=new Number1();
		int m;
		m=sc.nextInt();
		System.out.println(obj.isprime(m));
		System.out.println(obj.isPalindrome(m));
		System.out.println(obj.reverse(m));
	}
}

/*


C:\Users\prake\java1>javac -d c:\users\prake\java1. Number1.java

C:\Users\prake\java1>set classpath=;.;%c:\users\prake\java1%; c:\users\prake\java1;

C:\Users\prake\java1>javac userpack1.java

C:\Users\prake\java1>java userpack1
538
false
false
835

*/