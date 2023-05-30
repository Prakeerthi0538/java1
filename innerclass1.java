class outer
{
	class inner
	{
		public void methodOne()
		{
			System.out.println("Inner Demo");
		}
	}
	public void methodTwo()
	{
		inner i=new inner();
		i.methodOne();
	}
	public static void main(String args[])
	{
		outer o=new outer();
		o.methodTwo();
	}
}