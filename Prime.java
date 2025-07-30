import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner in =new Scanner(System.in);
        System.out.println("Enter the no");
        Long n=in.nextLong();
        long s,q=0;
        long p=1;
        long n1;
        n1=n;
        while(n>0)
        {
            n=n/10;
            p=p*10;
        }
        p=p/10;
        n=n1;
        while(n>0)
        {
            s=n/p;
            n=n%p;
            p=p/10;
            if(s==2 ||s==3 ||s==5||s==7)
            {
                System.out.print(s+" ");
            }

        }
    }
}