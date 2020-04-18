import java.util.Scanner;
class Main{
    public static int sum(int t)
    {  int sum1=0;
       for(int i=1;i<=t;i++) 
         sum1=sum1+i;
        return sum1;
    }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int  sum_of_n = sum(n);
        System.out.print(sum_of_n);
	}
}