import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum=0;
      int first=0;
      int last=n%10;
      while(n>0)
      {  
        first = n;
         n = n/10;
        
      }
       sum = first + last;
	   System.out.println(sum);
    }
}