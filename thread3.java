class Thread1 extends Thread
{
	public void run()
	{
		String name="prakeerthi Tammana";
		for(int i=0;i<name.length();i++)
		{
			System.out.println(name.charAt(i)+" ");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie)
			{
				System.out.println(ie);
			}
		}
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		t1.start();
	}
}

/*

C:\Users\prake\java1\jdbc>javac thread3.java

C:\Users\prake\java1\jdbc>java Mainclass
p
r
a
k
e
e
r
t
h
i

*/