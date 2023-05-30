
class Employee
{
	int empid;
	String empname;
	double sal;
	static String org_name="Aditya college of Engineering and Technology";
	static int count=0;
	static double total_sal=0;

	public Employee(int empid,String empname,double sal)
	{
		this.empid=empid;
		this.empname=empname;
		this.sal=sal;
		Employee.count++;
		Employee.total_sal+=sal;
	}
	public void showempinfo()
	{
		System.out.println("EMp