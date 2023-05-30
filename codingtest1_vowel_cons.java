import java.util.*;
class reply
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        String temp="aeiou";
        String ans="";

        int x=0;
        if(temp.indexOf(str.charAt(0))==-1)
        {
            ans+='C';
        }
        else
        {
            ans+='V';
        }
        for(int i=0;i<str.length();i++)
		{
            if(temp.indexOf(str.charAt(i))==-1)
            {
                if(ans.charAt(ans.length()-1)=='V')
                {
                    ans+='C';
                }
                x++;
            }
            else
            {
                if(ans.charAt(ans.length()-1)=='C')
                {
                    ans+='V';
                }
                x++;
            }
        }
        System.out.println(ans);
    }
}

/*

C:\Users\prake\java1\javalab>javac codingtest1_vowel_cons.java

C:\Users\prake\java1\javalab>java reply
hello world
CVCVCVC

*/