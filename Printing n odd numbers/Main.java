import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int j = 1;
      for(int i=1;i<=n;i++)
      {   
             if(j%2 == 1)
             {
              System.out.println(j);
             }
             else
             {
                i--;
             }
            j++;
      }
      
	}
}