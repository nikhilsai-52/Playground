import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int j=1;
      for(int i=1; i<=n ; i++)
      {
           if( j%2!=0)
               { 
                 for( int k=1;k<=n-1;k++)
                   System.out.print(j);
                  System.out.print(j+1);
                  j++;
               }
            else
            {
                System.out.print(j+1);
                for(int k=1;k<=n-1;k++)
                  System.out.print(j);
              j++;
            }
        System.out.print("\n");
	}
}
}