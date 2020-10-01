import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

 class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
      
			String k=sc.nextLine();
			  String a=k.toLowerCase();
        int flag=0;
        String b=new StringBuffer(a).reverse().toString();
        
        System.out.println(a);
        System.out.println(b);
  
        
        String a1="";
        String a2="";
        for(int i=0;i<a.length();i++)
        {
            if((i+1)%2==0)
            {
                a1+=(char)(a.charAt(i)-32);
            }
            else
                a1+=a.charAt(i);
        }
        
        for(int i=0;i<b.length();i++)
        {
            if(!((i+1)%2==0))
            {
                a2+=(char)(b.charAt(i)-32);
            }
            else
                a2+=b.charAt(i);
        }
        
        System.out.println("Edited =="+a1);
        System.out.println("Edited =="+a2);
		int f=0;
		int g=0;
	        for(int i=0;i<a.length();i++)
        {
				if((i+1)%2==0)
			{
				System.out.print(a2.charAt(f));
				f++;
			}
					
				else
			{
				System.out.print(a1.charAt(g));
				g++;
			}
					
        }
    }
}