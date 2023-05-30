import java.sql.*;
import java.util.Scanner;
class table1insert
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
		courseid=sc.nextLine();
		coursename=sc.nextLine();
		fees=sc.nextInt();
		duration=sc.nextInt();
		trainername=sc.nextLine();
		mobile=sc.nextInt();
     String query="insert into course values('"+courseid+"','"+coursename+"',"
		+fees+","+duration+",'"+trainername+"',"+mobile+")";

		//String query="insert into course values('C001','c',5000,3,'Pavan B',197458)";
		//insert into course values('c003','DBMS',5000,2,'M.Srinu',65646)
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
