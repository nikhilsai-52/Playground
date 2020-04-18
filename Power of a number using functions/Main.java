import java.util.Scanner;
class Main{
   public static void main(String[] args){  
       Scanner in = new Scanner(System.in);
       int base = in.nextInt();
       int exponent = in.nextInt();
       int power = fn(base,exponent);
        System.out.print(power);
   }
   public static int fn( int a, int b)
   {  int c=1;
      for(int i=1; i<=b ; i++)
      {
          c=c*a;
      }
      return c;
   }
}