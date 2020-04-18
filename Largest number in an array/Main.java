import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i = 0;i<n;i++)
      {
         ar[i] = in.nextInt();
      }
       int max = ar[0];
       for (int i=0;i<n;i++)
       {
           if(max<ar[i])
            max=ar[i];
         
       }
      System.out.print(max);
    
    }
}