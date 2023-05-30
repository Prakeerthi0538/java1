interface vehicle
{
	void changegear(int g);	
	void increasespeed(int s);
	void applybrake(int b);
}
class Bike implements vehicle
{
	int gear,speed=20;
	public void changegear(int g)
	{
		gear=g;
	}
	public void increasespeed(int s)
	{
		speed=speed+s;
	}
	public void applybrake(int b)	
	{
		speed=speed-b;
	}
	public void showvehiclestatus()	
	{
		System.out.println("Bike is currently at speed "+speed+"and on gear"+gear);	
	}	
}
class car implements vehicle
{
	int gear,speed=20;
	public void changegear(int g)
	{
		gear=g;
	}
	public void increasespeed(int s)
	{
		speed=speed+s;
	}
	public void applybrake(int b)	
	{
		speed=speed-b;
	}
	public void showvehiclestatus()	
	{
		System.out.println("Car is currently at speed "+speed+"and on gear"+gear);	
	}		
}	
class mainclass
{
	public static void main(String args[])
	{
		Bike b1=new Bike();
		b1.changegear(3);
		b1.increasespeed(70);
		b1.showvehiclestatus();
		b1.applybrake(30);
		b1.showvehiclestatus();
		
		car c1=new car();
		c1.changegear(3);
		c1.increasespeed(70);
		c1.showvehiclestatus();
		c1.applybrake(30);
		c1.showvehiclestatus();
	}
}