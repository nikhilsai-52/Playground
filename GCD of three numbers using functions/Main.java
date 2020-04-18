import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = gcd(n1,n2);
      int result1=gcd(result,n3);
      System.out.print(result1);
	}
   public static int gcd(int a, int b)
   {  int min=0;
      int temp=0;
       if(a>b)
         min=b;
        else
          min=a;
      while(min>1)
      {
            if( a%min==0 && b%min==0 )      
            {        
              temp=min;
              break;
            }
             min--;
      }
      return temp;
   }
}