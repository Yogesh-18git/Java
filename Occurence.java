import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Occurence {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in =new Scanner(System.in);
        int n,m,c=0,s;
           System.out.println("Enter the no");
        n=in.nextInt();
           System.out.println("Enter the no to be count");
        m=in.nextInt();
     
        while(n>0)
        {
            s=n%10;
            n=n/10;
            if(m==s)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}