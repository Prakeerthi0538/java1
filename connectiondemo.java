import java.sql.*;
class connectiondemo
{
	public static void main(String args[])throws Exception
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Keerthi@1210");
			if(con!=null)
				System.out.println("Database Connected");
			else
				System.out.println("Not Connected");
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
	}
}