import java.util.Scanner;
class String1
{
	public static boolean ispalindrome(String s)
	{
		int i,n;
		n=s.length();
		char ch[]=s.toCharArray();
		for(i=0;i<n/2;i++)
		{
			if(ch[i]!=ch[n-i-1])
				return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		s1=sc.nextLine();
		s1=s1.toLowerCase();
		if(ispalindrome(s1))
			System.out.println(s1+" is a palindrome");
		else
			System.out.println(s1+" is not a palindrome");
	}
}