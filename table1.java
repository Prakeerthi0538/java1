import java.sql.*;
class table1
{
	public static void main(String args[])throws Exception
	{
		try
		{
			
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Keerthi@1210");

		if(con!=null)
			System.out.println("Connection is Established");
		else
			System.out.println("Connection failed");

        String query="create table Course(cid varchar(20),cname varchar(20),fees float(6),duration integer(2),trainer varchar(20),mobile integer(10))";
		//3. Creation of Statement Object
		Statement st=con.createStatement();
		st.executeUpdate(query);
        System.out.println("Query executed Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
