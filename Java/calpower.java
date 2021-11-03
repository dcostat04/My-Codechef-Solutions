import java.util.*;

class Codechef
{
	public static void main (String args[])
	{
	    try 
	    {
	      Scanner scan = new Scanner(System.in);
    		int T = scan.nextInt();
    		int i;
    		for(i = 1; i <= T; i++)
    		{
    		    String s = scan.next();
    		    char temp[] = s.toCharArray();
    		    Arrays.sort(temp);
    		    int l = temp.length;
    		    int ans = 0;
    		    for(int j = 0; j < l; j++){
    		        ans += (j+1)*(temp[j] - 96);
    		    }
    		    System.out.println(ans);
    		}
	    } 
	    catch (Exception e) 
	    {
	        return;
	    }
	}
}
