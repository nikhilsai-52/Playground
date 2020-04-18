import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for(int i=1; i<=n ; i++)
      {    
          if(i==1 || i==n)
          { 
            for(int k=1; k<=n ; k++)
            {
              System.out.print("*"); 
            }
           }
         else
         {
             for(int k = 1; k<=n ;k++)
             {
                 if(k==1 || k==n)
                  System.out.print("*");
                  else
                    System.out.print(" ");
               
             }
          
         }
           
             System.out.print("\n");
         }
	}
}