import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Supchef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);  
		int test_case=sc.nextInt();
		for(int i=0;i<test_case;i++)
		{
		    int[] integers = new int[3];
            for(int j = 0; j < 3; j++)
            {
                integers[j] = sc.nextInt();
            }
            int a = integers[0];
            int b = integers[1];
            int c = integers[2];
            int d = b*c;
            if(a<=d)
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
