import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Right {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the no");
        int n=in.nextInt();
        int p=0;
        while(n>0)
        {
            p=n%10;
            n=n/10;
            System.out.print(p+" ");
            
        }
      
    }
}