import java.util.Arrays;
class packexp1
{
	public static void main(String args[])
	{
		int x[]={2,8,13,21,0};
		int y[]={0,2,8,13,21};
		System.out.println("Before sorting");
		for(int ele:x) //for each
			System.out.println(ele+" ");
		System.out.println();
		Arrays.sort(x);
		System.out.println("After sorting");
		for(int ele:x)
			System.out.println(ele+" ");

		System.out.println(Arrays.equals(x,y));
	}
}

/*
output
--------
Before sorting
2
8
13
21
0

After sorting
0
2
8
13
21
true

*/