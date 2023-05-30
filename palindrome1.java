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

		String words[]=s1.split(" ");
		//s1="AEC ACOE ACET"
		//WORDS[]={"AEC","ACOE"," ACET"} 

		for(int i=0;i<words.length;i++)
		{
			if(ispalindrome(words[i]))
				System.out.println(words[i]+" ");
		}
	}
}