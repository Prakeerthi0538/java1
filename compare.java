//Importing of package in another application.....
package pack.modules;
public class compare
{
	public int greatervalue(int x,int y,int z)
	{
		if(x>y)
		{
			if (x>z)
				return x;
			else
				return z;
		}
		else
		{
			if(y>z)
				return y;
			else
				return z;
		}
	}
	public int lesservalue(int x,int y,int z)
	{
		if(x<y)
		{
			if (x<z)
				return x;
			else
				return z;
		}
		else
		{
			if(y<z)
				return y;
			else
				return z;
		}
	}
}