
// permutation problem
class Test
{
	public static void main(String... args)
	{
		System.out.println(m1(1111));
	}
	public static int m1(int b1)
	{
		int result=1;
		String s=Integer.toString(b1);
		result=Stringperm("",s);
		return result;
	}

	public static int Stringperm(String prefix, String str)
	{
		int result=1;
		StringBuffer s1;
		StringBuffer s2;
		int len=str.length();
		if(len==0)
		{
			System.out.println(prefix);
			s1=new StringBuffer(prefix);
			s2=new StringBuffer(prefix);
			s2.reverse();
			if((s1.toString()).equals(s2.toString()))
			{
					result=2;
			}
		}
		else
		{
			for(int i=0;i<len&&result !=2;i++)
			{
			result=Stringperm(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,len));
			}
		}
	return result;
	}
}