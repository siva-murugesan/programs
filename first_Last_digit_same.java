import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String temp="";
        char t='a';
        int flag=0;
        int count=0;
        for(int i=a;i<=b;i++)
        {
            temp=""+i;
            if(temp.length()>1)
            {
                
            
            
                t=temp.charAt(0);
                if(t!=temp.charAt(temp.length()-1))
                {
                    flag=1;
                }
            
            
            if(flag==0)
            {
                count++;
            }
                
            }
            else
            {
                count++;
            }
            flag=0;
        }
        System.out.println(count);
    }
}