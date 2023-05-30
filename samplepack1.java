package pack.pack2;
import pack.pack1.Testpack;
public class samplepack1
{
	public static void main(String args[])
	{
		Testpack t1=new Testpack();
		t1.show();
	}
}

/*
C:\Users\prake\java1>javac -d c:\users\prake\java1. Testpack.java

C:\Users\prake\java1>set classpath=;.;%c:\users\prake\java1%; c:\users\prake\java1;

C:\Users\prake\java1>javac -d c:\users\prake\java1. samplepack1.java

C:\Users\prake\java1>set classpath=;.;%c:\users\prake\java1%; c:\users\prake\java1;

C:\Users\prake\java1>java pack.pack2.samplepack1
Hello..

*/

/*
 if we change the access specifier a protected..*/