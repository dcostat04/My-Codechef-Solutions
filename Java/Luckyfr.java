
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Luckyfr
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int a = sc.nextInt();
            String s = Integer.toString(a);
            int count=0;
            for (int i=0;i<s.length();i++) {
                if (Character.getNumericValue(s.charAt(i))==4){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
	}
}
