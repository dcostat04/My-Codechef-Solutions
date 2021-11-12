/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner sc = new Scanner (System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		
		int t=sc.nextInt();
		for (int i =0;i<t;i++)
		{
		   hillSequence();
		}
	}
	public static void hillSequence()
	{
	    
	      int n = sc.nextInt();
          int[] arr = new int[n];
          int i;
          HashMap<Integer,Integer> map = new HashMap<>();
          boolean isValid = true;
          for( i = 0; i < n; i++)
          {
            arr[i] = sc.nextInt();
          }
    
          try {
            for( i = 0; i < n; i++)
            {
              if(map.containsKey(arr[i]))
              {
                if(map.get(arr[i]) >= 2)
                {
                  isValid = false;
                }
                map.put(arr[i], map.get(arr[i])+1);
              }
              else
              {
                map.put(arr[i], 1);
              }
            }
          } catch (Exception e) 
          {
            System.out.println(e);
          }
          if(!isValid)
          {
            System.out.println(-1);
            return;
          }
          Arrays.sort(arr);
    
          boolean flag = true;
          for( i=1; i < n; i++)
          {
            if(arr[i] > arr[i-1])
            {
              continue;
            }else flag = false;
          }
          if(flag){
            for( i = n-1; i  >= 0; i--)
            {
              System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
          }
          if(arr.length < 3)
          {
            System.out.println(-1);
            return;
          }
          if(arr.length >= 3 && arr[n-1] == arr[n-2])
          {
            System.out.println(-1);
            return;
          }
          int max = arr[n-1];
          List<Integer> small = new ArrayList<>();
          List<Integer> large = new ArrayList<>();
          HashMap<Integer,Integer> map1 = new HashMap<>(); 
          for( i = 0; i < n-1; i++)
          {
            if(map1.containsKey(arr[i]))
            {
              large.add(arr[i]);
            }
            else
            {
              small.add(arr[i]);
              map1.put(arr[i], 1);
            }
          }
          if(small.size() < large.size())
          {
            Collections.sort(small);
            Collections.sort(large, Collections.reverseOrder());
            for(int m: small)
            {
              System.out.print(m + " ");
            }
            System.out.print(max + " ");
            for(int l : large)
            {
              System.out.print(l + " ");
            }
          }
          else
          {
            Collections.sort(small, Collections.reverseOrder());
            Collections.sort(large);
            for(int j: large)
            {
              System.out.print(j + " ");
            }
            System.out.print(max + " ");
            for(int k : small)
            {
              System.out.print(k + " ");
            }
          }
          System.out.println();	
		}
}
	
	    
