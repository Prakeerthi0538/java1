class Ticketcounter 
{
	private int availableseats=3;
	public synchronized void bookticket(String name,int num_seats)
	{
		if(availableseats>=num_seats && num_seats>0)
		{
			System.out.println("Hi, "+name+" : "+num_seats+" Seats booked successfull");
			availableseats=availableseats-num_seats;
		}
		else
		{
			System.out.println("Hi, "+name+"seats not avilable");
		}
	}
}
class TicketBookingThread extends Thread
{
	Ticketcounter tc;
	String pname;
	int num_seats;
	public TicketBookingThread(Ticketcounter tc,String pname,int num_seats)
	{
		this.tc=tc;
		this.pname=pname;
		this.num_seats=num_seats;
	}
	public void run()
	{
		tc.bookticket(pname,num_seats);
	}
}
class Mainclass
{
	public static void main(String args[])
	{
		Ticketcounter tc= new Ticketcounter();
		TicketBookingThread t1=new TicketBookingThread(tc,"Keerthi",2);
		TicketBookingThread t2=new TicketBookingThread(tc,"Pavani",2);
		TicketBookingThread t3=new TicketBookingThread(tc,"Varsha",1);
		t1.start();
		t2.start();
		t3.start();
	}
}

/*

C:\Users\prake\java1\jdbc>javac labticketcounter.java

C:\Users\prake\java1\jdbc>java Mainclass
Hi, Keerthi : 2 Seats booked successfull
Hi, Pavaniseats not avilable
Hi, Varsha : 1 Seats booked successfull

*/