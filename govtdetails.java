import java.util.*;
class Employee
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int empid;
		String ename,desg,company;
		float Salary;
		char gender;

		empid=sc.nextInt();
		sc.nextLine();
		ename=sc.nextLine();
		gender=sc.nextLine().charAt(0);
		desg=sc.nextLine();
		Salary=sc.nextFloat();
		sc.nextLine();
		company=sc.nextLine();

		System.out.println(empid);
		System.out.println(ename);
		System.out.println(gender);
		System.out.println(desg);
		System.out.println(Salary);
		System.out.println(company);
	}
}