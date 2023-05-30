import java.util.*;
class Array
{
	public static void reverse(int arr[],int size)
	{
		int left=0,right=size-1;
		while(left<right)
		{
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		
			right --;
			left++;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,x[],i;
		n=sc.nextInt();
		x=new int[n];
		for(i=0;i<n;i++)
		{
			x[i]=sc.nextInt();
		}
		System.out.println("After reverse os array");
		reverse(x,n);
		for(i=0;i<n;i++)
			System.out.println(x[i]+" ");
	}
}