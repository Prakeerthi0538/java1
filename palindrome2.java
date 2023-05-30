import java.util.Scanner;
class String1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1;
		int max_len=0,i;
		String temp=" ";
		s1=sc.nextLine();
		s1=s1.toLowerCase();

		String words[]=s1.split(" ");
		//s1="AEC ACOE ACET"
		//WORDS[]={"AEC","ACOE"," ACET"} 
		for(i=0;i<words.length;i++)
		{
			if(word[i].Length>max_len)
				max_len=word[i].Length;
				temp=word[i];
		}
		System.out.println("Longest word is = "+word[i]);
		System.out.println("Length is = "+word[i].Length);
	}
}