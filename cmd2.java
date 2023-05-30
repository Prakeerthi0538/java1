//Not fixed arguments to print........
/*class commandline2
{
	public static void main(String args[])
	{
		for(int i=0;i<args.length;i++)
			System.out.println("args["+i+"] ="+args[i]);
	}
}*/

class commandline2
{
	public static void main(String args[])
	{
		int sum;
		sum=0;
		for(int i=0;i<args.length;i++)
			sum=sum+Integer.parseInt(args[i]);
			System.out.println("Sum = "+sum);
	}
}