class outer
{
	class inner
	{
		public void methodOne()
		{
			System.out.println("Inner Demo");
		}
	}
	public static void main(String args[])
	{
		new outer().new inner().methodOne();
	}
}