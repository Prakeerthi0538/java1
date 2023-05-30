import java.util.*;
class season
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
		switch(a)
		{
			case 3:
			case 4:
			case 5:
				System.out.println("Summer");
				break;
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("Rainy");
				break;
			case 10:
			case 11:
			case 12:
			case 1:
			case 2:
				System.out.println("Winter");
				break;
			default:
				System.out.println("check number");
				break;
		}
	}
}

