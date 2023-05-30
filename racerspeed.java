import java.util.*;
class racer
{
	public static void main(String args[])
	{
		int r1,r2,r3,r4,r5;
		float avg;
		Scanner sc=new Scanner(System.in);
		r1=sc.nextInt();
		r2=sc.nextInt();
		r3=sc.nextInt();
		r4=sc.nextInt();
		r5=sc.nextInt();
		avg=(float)(r1+r2+r3+r4+r5)/5;
		switch(1)
		{
			case 1: r1>avg;
				System.out.println(r1+"Test passed");
				break;
			case 2: (r2>avg);
				System.out.println(r2+"Test passed");
				break;
			case 3: (r3>avg);
				System.out.println(r3+"Test passed");
				break;
			case 4: (r4>avg);
				System.out.println(r4+"Test passed");
				break;
			case 5: (r5>avg);
				System.out.println(r5+"Test passed");
				break;
			default:
				System.out.println("No one passed the test");
				break;
		}
	}
}