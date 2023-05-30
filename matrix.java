import java.util.Scanner;
class variablelengtharrays
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x[][]=new int[3][];
		x[0]=new int[4];
		x[1]=new int[2];
		x[2]=new int[3];
		// array name x =>find the length of the array => x.length;

		for(int i=0;i<x.length;i++)
			System.out.println(x[i].length);
	
		//Reading of variable length array
		for(int i=0;i<x.length;i++)
			for(int j=0;j<x[i].length;j++)
				x[i][j]=sc.nextInt();

		//printing of variable length arrays
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
}
