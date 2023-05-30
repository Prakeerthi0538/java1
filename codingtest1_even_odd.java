import java.util.*;
class count
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n-2;i++)
		{
			if(a[i]%2==0 && a[i+2]%2!=0 || a[i]%2!=0 && a[i+2]%2==0)
			{
				c++;
			}
		}
		System.out.println(c);
	}
}

/*

C:\Users\prake\java1\javalab>javac codingtest1_even_odd.java

C:\Users\prake\java1\javalab>java count
7
1 2 4 5 6 7 7
3

*/