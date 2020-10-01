/*

Longest sequence number

Determine the longest consecutive sequence from a given number

Input Format

			Contains number to check

Constraints

			Number should be a integer number of any size including 0

Output Format

			Output contains Longest sequence

Sample Input 0
	12345789123456

Sample Output 0
	123456

Sample Input 1
	0123400123
Sample Output 1
	01234

*/


class test
{
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);


    String s=sc.nextLine();


    if(s.length()==0)
    {
        System.out.println("");
    }
    else if(s.length()==1)
    {
        System.out.println(s);
    }
    else
    {
    String fin="";
    int a=Character.getNumericValue(s.charAt(0));
    String temp="";
    int t=0;
    int flag=0;
        
    //System.out.println(s.length());
    for(int i=1;i<s.length();i++)
    {
      //  System.out.println("----");
        t=Character.getNumericValue(s.charAt(i));
      //  System.out.println("a,t"+a+""+t);

        if(i==1 && a+1==t)
        {
          //  System.out.println(a+""+t); 
            temp+=a;
            temp+=t;
            a=t;
        }
        else if(i!=1 && a+1==t)
        {
          //  System.out.println(t); 
            temp+=t;
            a=t;
        }
        else 
        {
            fin+=temp+",";
            temp="";
            a=t;
            temp+=a;
        }
              //  System.out.println("temp"+temp);
        //a=Character.getNumericValue(s.charAt(i));
        if(i==s.length()-1 && !(temp.isEmpty()))
        {
            fin+=temp;
        }
   // System.out.println("---");
        a=t;
    }
        
        
        
       //System.out.println(fin); 
        String[] b=fin.split(",");
        int[] le=new int[b.length];
        for(int i=0;i<b.length;i++)
        {
            le[i]=b[i].length();
        }
        int max=le[0];
        int j=0;
        for(int i=1;i<b.length;i++)
        {
            if(max<le[i])
            {
                max=le[i];
                j=i;
            }
        }
        System.out.println(b[j]);
    }
    }
}
