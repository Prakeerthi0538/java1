interface animal
{
	void eat();
	void sound();
	void running();
}
class Dog implements animal
{
	public void eat()
	{
		System.out.println("Meet + Non veg");
	}
	public void sound()
	{
		System.out.println("Bow Bow...");
	}
	public void running()
	{
		System.out.println("Running faster");
	}
}
class Tiger implements animal
{
	public void eat()
	{
		System.out.println("Meet");
	}
	public void sound()
	{
		System.out.println("roaring...");
	}
	public void running()
	{
		System.out.println("Run's faster");
	}
}
class mainclass
{
	public static void main(String args[])
	{
		animal a;
		a=new Dog();
		a.eat();
		a.sound();
		a.running();

		a=new Tiger();
		a.eat();
		a.sound();
		a.running();
	}
}