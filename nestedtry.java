class NestedTry
{
	public static void main(String args[])
	{
		int x[]={10,20,40};
		try
		{
			System.out.println(x[2]);
			try
			{
				int z=10/0;
			}
			catch(NumberFormatException ae)
			{
				System.out.println("Invalid division operator");
			}
			System.out.println("Inner try block close");
		}
		catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("Index out of range");
        }
		catch(Exception e)
        {
            System.out.println("outer try block catch statement");
        }
        System.out.println("outer try block closed");
	}
}