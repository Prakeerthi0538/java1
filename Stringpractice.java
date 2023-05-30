package pack.modules;
public class stringpractice
{
	public String strreverse(String s)
	{
		String rs=" ";
		for(int i=0;i<s.length();i++)
		{
			rs=s.charAt(i)+rs;
		}
		return rs;
	}
	public boolean strpalindrome(String s)
	{
		String ps=strreverse(s);
		if(s.equals(ps))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String strvowel(String s)
	{
		String vowels="AEIOUaeiou";
		String str=" ";
		for(int i=0;i<s.length();i++)
		{
			char ch=str.charAt(i);
			if(vowels.contains(ch+" "))
				str=str+ch;
		}
		return str;
	}
}