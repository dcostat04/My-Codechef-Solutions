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
		        
		        // Dragon
		        int dsa1 = scan.nextInt();
		        int toc1 = scan.nextInt();
		        int dm1  = scan.nextInt();
		        int add1 = dsa1+toc1+dm1;
		        
		        // Sloth
		        int dsa2 = scan.nextInt();
		        int toc2 = scan.nextInt();
		        int dm2  = scan.nextInt();
		        int add2 = dsa2+toc2+dm2;
		        
		        if(add1>add2){
		            System.out.println("DRAGON");
		        }
		        else if(add2>add1){
		            System.out.println("SLOTH");
		        }
		        else{
		            
		            if(dsa1 == dsa2 && toc1 ==toc2 && dm1==dm2){
		            System.out.println("TIE");
		            }
		            else if(dsa1>dsa2){
		                System.out.println("DRAGON");
		            }
		            else if(dsa2>dsa1){
		                System.out.println("SLOTH");
		            }
		            else if(toc1>toc2){
		                System.out.println("DRAGON");
		            }
		            else if(toc2>toc1){
		                System.out.println("SLOTH");
		            }
		            else if(dm1>dm2){
		                System.out.println("DRAGON");
		            }
		            else if(dm2>dm1){
		                System.out.println("SLOTH");
		            }
		            
		        }
		        
		        
		}
	}
}
