import java.util.Scanner;
import pack.modules.compare;
class customer
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		compare c=new compare();
		int m,n,o;
		m=sc.nextInt();
		n=sc.nextInt();
		o=sc.nextInt();
		System.out.println("Max = "+c.greatervalue(m,n,o));
		System.out.println("Max = "+c.lesservalue(m,n,o));
	}
}