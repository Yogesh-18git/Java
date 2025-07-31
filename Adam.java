import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Adam {

    public static int reverse(int n)
    {
        int s,r=0;
        int n1=n;
         while(n>0)
        {
            s=n%10;
            r=(r*10)+s;
            n=n/10; 
        }
        n=n1;
        return r;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int x,a,b,y,c;
        x=n*n;
        a=reverse(n);
        b=reverse(x);
       y=a*a;
        c=reverse(y);
        if(x==c)
        {
            System.out.println("Adam Number");
        }
        else
        {
             System.out.println("Not a adam number");   
        }
    }
}
