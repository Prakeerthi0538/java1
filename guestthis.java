//    Using this()....... this is used with in a constructor class...
class A
{
	public A() //default constructor....
	{
		//this("THUB");
		System.out.println("Welcome to guest");
	}
	public A(String name)
	{
		this();
		System.out.println("Welcome to "+name);
	}
}
class maincls
{
	public static void main(String args[])
	{
		A a=new A("Keerthi");
	}
}
