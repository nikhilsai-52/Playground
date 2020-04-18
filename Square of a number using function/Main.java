import java.util.Scanner;
class Main
{   public static int square(int t)
     {   
         int a;
         a=t*t;
         return a;
     }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sol_sq= square(n);
      System.out.print(sol_sq);
	} 
}