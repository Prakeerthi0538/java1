class Animal
{
	public void eat()
	{
		System.out.println("Eating the food");
	}
}
class Herbivores extends Animal
{
	public void eat()
	{
		System.out.println("Eating plant only");
	}
}
class Carnivores extends Animal
{
	public void eat()
	{
		System.out.println("Eating meet only");
	}
}
class Omnivores extends Animal
{
	public void eat()
	{
		System.out.println("Eating both plants and meet");
	}
}
class maincls
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();

		Herbivores h=new Herbivores();
		h.eat();

		Carnivores c=new Carnivores();
		c.eat();

		Omnivores o=new Omnivores();
		o.eat();
	}
}