class DaemonThread extends Thread
[
	public void run()
	{
		//checking whether the thread is Daemon or not...
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon executing");
		}
		else
		{
			System.out.println("Use normal Thread");
		}
	}
	public static void main(String args[])
	{
		DaemonThread t1=new DaemonThread();
		DaemonThread t2=new DaemonThread();
		//Making user thread t1 to Daemon.... 
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}
}
	