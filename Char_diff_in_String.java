/*
STEP1. 
	In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word. STEP2. Concatenate the sums of each word to form the result. 
For example —If the given string is "WORLD WIDE WEB' STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word. WORLD = [W-D]+[O-L]+[R] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40] WIDE = [W-E]+[I-D] = [23-5]+[9-4] = [18]+[5] = [23] WEB = [W-B]+[E] = [23-2]+[5] =[21]+[5] = [26] 

STEP2. 
	Concatenate the sums of each word to form the result [40] [23] [26] [402326] The answer (output) should be the number 402326. 

NOTE1:
	The value of each letter is its position in the English alphabet system i.e. a=A=1, b=8=2, c=C=3, and so on till z=Z=26. So, the result will be the same for "WORLD WIDE WEB" or -World Wide Web" or "world wide web" or any other combination of uppercase and lowercase letters. 

IMPORTANT Note: 
	In Step1. after subtracting the alphabets, we should use the absolute values for calculating the sum. For instance, in the below example, both [H-0] and [E-L] result in negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences. Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26] 

Assumptions: 
	The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words. 
You are expected to help Zak, by writing a function that takes a string (sentence) as input, performs the above mentioned processing on the sentence and returns the result (number). 

Examplel: inputs = "World Wide Web" outputs = 402326 

Example2:

	inputs = "Hello World" outputs = 2640 Explanation:  Hello = [H-O]+[E-L]+[L] = [8-15]+[5-12]+[12] = [7]+[7]+[12] = [26] World = [W-D]+[O-LHR] = [23-4]+[15-12]+[18] = [19]+[3]+[18] = [40] Result = Number formed by concatenating [26] and [40] = 2640 
*/

class test
{
	public static void main(String[] args) 
	{
		System.out.println(findStringCode("Hello World"));
	}

	public static int findStringCode(String input1)
	{

	String s=input1.toLowerCase();
	   String[] a=s.split(" ");
	   String fin="";
	   int st=0;
	   int en=0;
	   int is=0;
	   int ie=0;
	   String diff="";
	   int sum=0;
		int con=0;
		String fsum="";
	   for(int j=0;j<a.length;j++)
	   {
		   sum=0;
			if(a[j].length()%2==0)
				con=a[j].length()/2;
			else
				con=a[j].length()/2+1;
	   for(int i=0;i<con;i++)
	   {
		   st=i;
		   en=a[j].length()-1-i;
		   if(!(st==en))
		   {
			   is=a[j].charAt(st);
			   ie=a[j].charAt(en);
			  /* System.out.println(a[j].charAt(st));
			   System.out.println(is);
			   System.out.println(a[j].charAt(en));
			   System.out.println(ie);
			   System.out.println("----------");*/
			   if(ie>is)
			   {
				  // System.out.println("diff"+(ie-is));
				   sum+=(ie-is);
			   }
			   	
				else
				{
					//System.out.println("diff"+(is-ie));
						sum+=(is-ie);
				}
				
		   }
		   else
		   {

			 /*  System.out.println(a[j].charAt(i));
			   System.out.println(i);
			   System.out.println("----------");*/
			   sum+=(a[j].charAt(i)-96);
		   }
		  // System.out.println(sum);
	   }
		fsum+=sum;
	   }
	   return Integer.parseInt(fsum);
	}
}

