import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = fn(n1,n2);
      if( result > n3 )
        System.out.print(result);
      else
        System.out.print(n3);
	}
   public static int fn( int a, int b)
   { 
     if(a>b)
       return a;
     else
       return b;
   }
}