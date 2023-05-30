class stringbuffer1
{
	public static void main(String args[])
	{
		StringBuffer sb1=new StringBuffer("T Hub");
		System.out.println(sb1.capacity());
		System.out.println(sb1.length());
		sb1.insert(1," echnical ");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer("Keerthi");
		sb2.setCharAt(2,'M');
		System.out.println(sb2);

		StringBuffer sb3=new StringBuffer("Aditya");
		sb3.append(" Engineering College");
		System.out.println(sb3);
	}
}