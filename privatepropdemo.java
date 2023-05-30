class privatepropdemo
{
	private int age=20;
	private String name="Keerthi";
	double salary = 150000;
	public void setAge(int age)
	{
		this.age=age;
	}
	public int getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}
class sample
{
	public static void main(String args[])
	{
		privatepropdemo p=new privatepropdemo();
		System.out.println(p.getAge());
		System.out.println(p.getName());
		System.out.println(p.salary);
	}
}
