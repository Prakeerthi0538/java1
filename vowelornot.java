//using if and else case....
/*import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.nextLine().charAt(0);
		ch=Character.toLowerCase(ch);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else
		{
			System.out.println(ch+" is consonent");
		}
	}
}
*/

//using switch case......

import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char ch;
		ch=sc.nextLine().charAt(0);
		ch=Character.toLowerCase(ch);
		switch(ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch+" is vowel");
				break;
			default:
				System.out.println(ch+" is consonent");
				break;
		}
	}
}











