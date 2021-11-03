
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		while(t-->0)
		{
		    int n = Integer.parseInt(br.readLine());
		    String [] str = br.readLine().split(" ");
		    int [] arr = new int[n];
		    int i;
		    for(i=0;i<n;i++)
		        arr[i] = Integer.parseInt(str[i]);
		        
	        for(i=0;i<n;i++)
	        {
	            int res;
	            if(i==0)
	            res = (arr[i]&arr[i+1]);
	            else if(i==n-1)
	                res = (arr[i]&arr[i-1]);
	                else
	                res = (arr[i]&arr[i-1])>(arr[i]&arr[i+1])?(arr[i]&arr[i-1]):(arr[i]&arr[i+1]);
	                System.out.print(res+" ");
	        }
		        System.out.println();
		        
		  }
	}
}
