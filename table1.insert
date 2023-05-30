import java.sql.*;
import java.util.Scanner;
class DeleteDemo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String courseid,coursename,trainername;
		int fees,mobile,duration;
		try
		{
		// 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. Get the Connection Object
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","Keerthi@1210");

		//if(con!=null)
		//	System.out.println("Connection is Established");
		//else
		//	System.out.println("Connection failed");
   
        System.out.println("Enter the course id to delete");
        courseid=sc.nextLine();
		
		
     String query="delete from course where cid='"+courseid+"'";

		//insert into course values('c003','DBMS',5000,2,'M.Srinu',65646)
		//3. Creation of Statement Object
		Statement st=con.createStatement();
		st.executeUpdate(query);
        System.out.println("Deleted the record Successfully");

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
