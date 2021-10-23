import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);  
		int test_case=sc.nextInt();
		for(int i=0;i<test_case;i++)
		{
            int a = sc.nextInt();
            if(a%4==0)
            {
                System.out.println("No");
            }
            else
            {
                System.out.println("Yes");
            }
		}
	}
}
