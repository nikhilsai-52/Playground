import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = n%10;
    int b = (n/10)%10;
    int c = n/100;
    System.out.print(a);
    System.out.print(b);
    System.out.print(c);
    
  }
}