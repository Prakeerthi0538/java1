import java.util.Scanner;
class Box
{
	double l,b,h,area,vol;
	public Box()
	{
		l=b=h=1;
	}
	public Box(double d)
	{
		l=b=h=d;
	}
	public Box(double l,double b,double h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
	}
	public double calarea()
	{
		return l*b;
	}
	public double calvol()
	{
		return l*b*h;
	}
	public void show()
	{
		System.out.println(this.l+" "+this.b+" "+this.h);
		System.out.println("Area="+calarea());
		System.out.println("Volume="+calvol());
	}
}
class mainclass
{
	public static void main(String args[])
	{
		Box b1=new Box();
		b1.show();
		
		Box b2=new Box(4);
		b2.show();

		Box b3=new Box(4,5,6);
		b3.show();
	}
}
		