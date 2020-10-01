class test { 
    public static void main(String[] args) 
    { 
        int n=Integer.parseInt(args[0]);
		int val=0;
		int a;
		int le=0;
		int flag=0;
for(a=2;val !=n;a++)
{
	flag=0;
		if(a==2)
		{
			System.out.println(2);
			val++;
		}
			
		else if(a>2 && a%2!=0)
		{
		le=(int)(Math.sqrt(a));
		for(int i=3;i<=le;i++)
			{
				if(a%i==0)
					flag=1;
				i++;
			}
		if(flag==0)
			{
				System.out.println(a);
				val++;
			}
		}
}
		}


}