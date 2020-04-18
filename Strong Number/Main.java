import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int a = 0;
      int product = 1;
      int sum = 0;
      int temp = n;
      while(n>0)
      {     product = 1;
            a=n%10;
            for(int i=1;i<=a;i++)
            { 
              product = product*i;
                
            }
            sum = sum + product;
         n = n/10;
      }
      if(temp == sum)
       System.out.println("Yes");
      else
        System.out.println("No");
	}
}