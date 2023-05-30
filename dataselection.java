import java.sql.*;
import java.util.Scanner;
class dataselection
{
	public static void main(String args[])throws Exception
	{
		Connection con=null;
		Statement st=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Keerthi@1210");
			if(con!=null)
				System.out.println("Database Connected");
			else
				System.out.println("Not Connected");
			st=con.createStatement();
			String query="Select * from course";
			ResultSet rs=st.executeQuery(query);
			while(rs.next())
			{
				String courseId=rs.getString(1);
				String courseName=rs.getString(2);
				float courseFees=rs.getFloat(3);
				String trainerName=rs.getString(5);
				String Query=(courseId +" "+courseName+" "+courseFees+" "+trainerName);
			}
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
		System.out.println("Task completed");
	}
}