import java.util.*;
class terinaryoperator
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		age=sc.nextInt();
		String result=age>=18?"you are eligible to vote":"you are not eligible for vote";
		System.out.println(result);
	}
}