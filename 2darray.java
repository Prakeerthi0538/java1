import java.util.*;
class array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row,col,i,j,mat[][];
		row=sc.nextInt();
		col=sc.nextInt();
		mat=new int[row][col];
		//Reading of matrix
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				mat[i][j]=sc.nextInt();

		//Displayinga matrix
		System.out.println("Given matrix is:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				// for transpose....mat[j][i]...
				System.out.print(mat[j][i]+" ");
			System.out.println();
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
				// for normal matrix....mat[i][j]...
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
}
/*
import java.util.*;
class array
{
	public static void transpose(int arr[][],int row,int col)
	{
		int temp[][]=new int[row][col];
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				temp[i][j]=arr[j][i];
		display(temp,row,col);
	}
	public static void display(int arr[][],int row,int col)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println( );
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int row,col,i,j,mat[][];
		row=sc.nextInt();
		col=sc.nextInt();
		mat=new int[row][col];
		//Reading of matrix
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				mat[i][j]=sc.nextInt();

		//Displaying a matrix
		System.out.println("Given matrix is:");
		display(mat,row,col);
		System.out.println("Transpose of given matrix");
		transpose(mat,row,col);
		
	}
}
*/