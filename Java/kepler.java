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
		for (int i =0;i<t;i++){
		    int t1 = scan.nextInt();
		    int t2 = scan.nextInt();
		    int r1 = scan.nextInt();
		    int r2 = scan.nextInt();
		    
		    double a = t1*t1;
		    double b = r1*r1*r1;
		    double c = t2*t2;
		    double d = r2*r2*r2;
		    
		    double e = a/b;
		    double f = c/d;
		    
		    if(e == f){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
