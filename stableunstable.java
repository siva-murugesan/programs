/*

Find Password:

Detective Buckshee junior has been approached by the shantiniketan kids society for help in finding the password to the games complex. After hearing the scenario, detective Buckshee junior realizes that he will need a programmers support. He contacts you and requests your help. Please help the detective by writing a function to generate the password.

The scenario is as below:-

Five numbers are available with the kids.

These numbers are either stable or unstable.

A number is STABLE if each of its digit occur the same number of times. i.e the

frequency of each digit in the number is the same. For e.g. 2277, 4004, 11, 23,

583835, 1010 are examples of stable numbers.

Similarly, A number is UNSTABLE if the frequency of the each digit in the number is

NOT the same, For e.g 221, 4314, 101, 233, 58135, 101 are examples of

unstable numbers.

The password can be found as below:-

i.e. Password=sum of all unstable numbers.

For Example: if input1=12, input2=1313, input3=122, input4=678, and input5=898,

stable numbers are 12, 1313 and 678

unstable numbers are 122 and 898

So, the password should be=sum of all unstable numbers=1020

*/

import java.util.*;
class test
{
	public static void main(String[] args)
	{
		char[] c;
		int[] count;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int flag=0;
		String fin="";
		for (int i=0;i<5 ;i++ )
		{
			a[i]=sc.nextInt();
		}


		String unstable="";
		String temp="";
		String o="";
		int j=0;
		for(int i=0;i<5;i++)
		{
			o="";
			temp=a[i]+"";
			o+=temp.charAt(0);
			for (j=1;j<temp.length() ;j++)
			{
				if(!(o.contains(""+temp.charAt(j))))
					o+=temp.charAt(j);
			}
			System.out.println("unique"+o);
			o.toCharArray();
			count=new int[o.length()];
			int co=0;

			for (int k=0;k<o.length() ; k++)
			{
				co=0;
	
					for (int m=0;m<temp.length() ;m++ )
					{
						if((""+o.charAt(k)).equals(""+temp.charAt(m)))
							co++;

					}
				count[k]=co;
			}
			System.out.println(java.util.Arrays.toString(count));
			for (int m=1;m<o.length() ;m++ )
			{
				if(count[0]!=count[m])
					flag=1;
			}
			
			if(flag==1)
				fin+=temp+",";
			flag=0;
		}
		
	
		System.out.println(fin);
			String[] sp=fin.split(",");
	int sum=0;
	for(int m=0;m<(sp.length) ;m++ )
	{
		System.out.println(sp[m]);
	}
	for(int m=0;m<(sp.length) ;m++ )
	{
		sum+=Integer.parseInt(sp[m]);
	}
	System.out.println(sum);
	}

}
/*
user inputs 
12
1313
678
122
898

output
1020
*/