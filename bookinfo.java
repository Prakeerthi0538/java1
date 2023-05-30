import java.util.Scanner;
class Book
{
	String bid,name,author;
	int pgs;
	double cost;
	Scanner sc=new Scanner(System.in);
	public void getdetails()
	{
		bid=sc.nextLine();
		name=sc.nextLine();
		author=sc.nextLine();
		pgs=sc.nextInt();
		cost=sc.nextDouble();
	}
	public void showdetails()
	{
		System.out.println(bid+"  "+name+"  "+author+"  "+pgs+"  "+cost);
	}
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			Book bi=new Book();
			bi.getdetails();
			bi.showdetails();
		}
	}
}
