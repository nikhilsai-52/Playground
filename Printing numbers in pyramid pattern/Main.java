import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = 1;
      for( int rows=1;rows<=n;rows++)
      {
             for( int space=1;space<=(n-rows);space++)
             {
               System.out.print(" ");
             }
             
             for(int col=1;col<=rows ;col++)
             {
                    System.out.print(num+" ");
                     num=num+1;
             }
          System.out.print("\n");
      }
    }    
}