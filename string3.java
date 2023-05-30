import java.util.*;
class string
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		string words[]=s1.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String rev_word=" ";
			for(int j=0;j<words[i].length();j++)
			{
				rev_word=words[i].charAt(j)+rev_word;
			}
			System.out.println(rev_word);
		}
	}
}