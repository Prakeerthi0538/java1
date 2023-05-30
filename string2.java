import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		char ch[]=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
				count++;
		}
		System.out.println(count+1);
		String words[]=s1.split(" ");
		System.out.println(words.length);
	}
}