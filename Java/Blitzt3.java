import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Blitzt3
{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int t;
    t= sc.nextInt();
    while (t>0){
        int N=0;
        int A=0;
        int B=0;
        try{
        N=sc.nextInt();
        A= sc.nextInt();
        B= sc.nextInt();
       
        System.out.println(360 + 2*N - (A+B));
        }
        catch(Exception e){
            return;
        }

    }
}
}
