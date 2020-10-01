
/*
How to attempt? Question 
Addition using Strings: 
	Write a function that takes two numbers in stnng format and forms a string containing the sum (addition) of these two numbers. 

Assumption(s): • The input strings will contain only numeric digits 
• The input strings can be of any large lengths 
• The lengths of the two input string need not be the same 
• The input strings will represent only positive numbers 
For example — • If input strings are '1234" and "56". the output string should be "1290" 
• if input strings are '56' and "1234'', the output string should be "1290" 
• If input strings are "123456732128989543219" and "987612673489652 the output stnng should be "123457719741663032871" 
NOTE: In Java & C#, this logic can be easily implemented using Biglnteger However for the sake of enhancing your programming skills. 
you are recommended to solve this question without using Biglnteger. 

*/



class test
{
	public static void main(String[] args) 
	{
		System.out.println(addition("12342435246547567567","945876878909803624612341"));
	}

	public static String addition(String input1,String input2)
	{
		String large="";
		String small="";
		int sum,carry;
		sum=carry=0;
		StringBuffer fin=new StringBuffer();
		String fin1="";
		long temp=0;
		String rem="";
		if(input1.length()>input2.length())
		{
			small=input2;
			large=input1.substring(input1.length()-input2.length(),input1.length());
			rem=input1;
		}
		else
		{
			small=input1;
			large=input2.substring(input2.length()-input1.length(),input2.length());
			rem=input2;
		}
		sum=0;
		for(int i=small.length()-1;i>=0;i--)
		{
			sum=Character.getNumericValue(large.charAt(i))+Character.getNumericValue(small.charAt(i))+carry;
			if(sum>9)
			{
				carry=sum/10;
				sum=sum%10;
			}
			else
			{
				carry=0;
			}
		System.out.println("1d sum"+sum+"carry"+carry);
		fin.insert(0,sum);
		}
		System.out.println("after for");
		if(carry!=0)
		{
			System.out.println("fin"+fin);
			
			fin1=rem.substring(0,rem.length()-small.length());
			if(!(fin1.isEmpty()))
			{
			System.out.println("fin1="+fin1);
			temp=Long.parseLong(fin1)+carry;
			System.out.println("temp"+temp);
			fin1=""+temp;
			System.out.println("fin1="+fin1);
			}
			else
			{
				fin1=""+carry;
			}
		}
		else
		{
		System.out.println("fin"+fin);
		fin1=rem.substring(0,rem.length()-small.length());
		System.out.println("fin1="+fin1);
		}
		System.out.println("final addition = "+fin1+fin);

		return fin1+fin;
	}
}