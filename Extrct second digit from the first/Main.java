import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int second_number=0;
      while(n>0)
      {  
        if(n/10>0)
        {
          second_number=n%10;
        }
          n = n/10;
        
      }
      System.out.println(second_number);
       
    }
}