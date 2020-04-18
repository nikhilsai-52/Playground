import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i=0 ; i<n ; i++)
      {
        
       ar[i] = in.nextInt(); 
      }
      for(int j=1; j<=n;j++)
      { int count =0;
         for(int k=0 ; k<n ; k++) 
         {   
           if(j==ar[k])
             count++;
        
         }
         if(count == 0)
         {
          System.out.print(j); 
           
         }
      }
}
} 