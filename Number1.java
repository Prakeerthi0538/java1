package pack.modules;
public class Number1
{
	public boolean isprime(int n)
	{
		//int n;
		for(int i=2; i<=(int)Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public boolean isPalindrome(int n)
	{
		  int m=n;
		  int sum=0;
		 while(n!=0)
		{
           sum=sum*10+n%10;
		   n=n/10;
		}
		if(m==sum)
			 return true;
		else
			 return false;
	}
	public int reverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			sum=sum*10+n%10;
			n=n/10;
		}
		return sum;
	}
}   
