import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	  Scanner in = new Scanner(System.in);
      int number = in.nextInt();
      pf(number);
      
    }
    public static void pf(int a)
    {   int count;
       for(int i=2; i<=a ;i++)
       {  count=0;
          for(int j=1 ; j<=a ; j++)
          {
                if( i%j == 0)
                  count++;
          }
         if(count == 2)
           System.out.println(i);
       }
       
     }
}