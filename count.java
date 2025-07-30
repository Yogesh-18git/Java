
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class count {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        long n=in.nextLong();
        int c=0;
        while(n>0)
        {
            n=n/10;
            c=c+1;
        }
        System.out.println(c);
    }
}