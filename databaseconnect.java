interface databaseconnect
{
	void getconnection();
	void executequery();
	void showresults();
	void close();
}
class mysql implements databaseconnect
{
	public void getconnection()
	{
		System.out.println("connect with mysql database");
	}
	public void executequery()
	{
		System.out.println("Query executed in mysql database");
	}
	public void showresults()
	{
		System.out.println("mysql will display the result");
	}
	public void close()
	{
		System.out.println("close the connection with mysql");
	}
}
class oracle implements databaseconnect
{
	public void getconnection()
	{
		System.out.println("connect with oracle database");
	}
	public void executequery()
	{
		System.out.println("Query executed in oracle database");
	}
	public void showresults()
	{
		System.out.println("oracle will display the result");
	}
	public void close()
	{
		System.out.println("close the connection with oracle");
	}
}
class mainclass
{
	public static void main(String args[])
	{
		 databaseconnect d;
		d=new mysql();
		d.getconnection();
		d.executequery();
		d.showresults();
		d.close();

		System.out.println("\n");

		d=new oracle();
		d.getconnection();
		d.executequery();
		d.showresults();
		d.close();
	}
}