/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     
		Scanner scan = new Scanner (System.in);
		int t=scan.nextInt();
		int a[]=new int[t];
		for (int i =0;i<t;i++)
		{
		     a[i] = scan.nextInt();
		}
		for (int i =0;i<t;i++)
		{
		        int k=1;
		        int j=0;
		        while(k<=a[i]){
		            if(k%2==1){
		                j=j+3;
		            }
		            else{
		                j=j-1;
		            }
		            k++;
		        }
		 System.out.println(j);
		}    
		        
		
		
	}
}
