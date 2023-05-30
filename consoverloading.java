class Testing
{
	int age;
	String name;
	public Testing()      //Default
	{
		System.out.println("Default Constructor");
		age=18;
		name="guest";
	}
	public Testing(String cname)
	{
		System.out.println("Parameterized with one arguments");
		age=18;
		name=cname;
	}
	public Testing(String cname,int cage)
	{
		System.out.println("Parameterized with two arguments");
		age=cage;
		name=cname;
	}
	public void show()
	{
		System.out.println("Good Morning! Ms."+name+" and your age is "+age);
	}
	public static void main(String args[])
	{
		Testing t1=new Testing();
		Testing t2=new Testing("Prakeerthi");
		Testing t3=new Testing("Nandu",19);

		t1.show();
		t2.show();
		t3.show();
	}
}
	