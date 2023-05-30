import java.sql.*;
import java.util.Scanner;
class preparedstatement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		preparedstatement pstmt=null;
		int k;
		try
		{
			Class.forName("con.mysql.cj.jdbc.Driver");
			con.DriverManager.getCOnnecction("jdbc:mysql://localhost:3306/db1","root","Keerthi@1210");
			if(con!=null)
				System.out.println("Connection established Successfully");
			pstmt=con.preparedstatement("insert into course values(?,?,?,?,?,?)");
			k=sc.nexxtInt();
			sc.nextLine();
			while(k>0)
			{
				String cid=sc.nextLine();
				String cname=sc.nextLine();
				float fees=sc.nextInt();
				int duration=sc.nextInt();
				sc.nextLine();
				String trainername=sc.nextLine();
				int mobile=sc.nextInt();
				sc.nextLine();
				pstmt.SetString(1,cid);
				pstmt.setString(2,cname);
				pstmt.setFloat(3,fees);
				pstmt.setInt(4,duration);
				pstmt.setString(5,trainername);
				pstmt.setInt(6,mobile);
				k--;
			}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}