import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = n;
        int temp = n;
        int count = 0; 
        int b=0;
        int product=0;
        int sum=0;
      while(a>0)
      { 
        a = a/10;
        count++;
      }
      while(n>0)
      {  product=1;
        b= n%10;
        for( int i=1;i<=count;i++)
        { 
           product = product * b; 
        }
        sum = sum + product;
        n=n/10;
        
      }
      if( sum == temp)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}