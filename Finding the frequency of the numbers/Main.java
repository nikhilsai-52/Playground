import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int k = in.nextInt();
      int ar[]= new int[n];
      for(int i=0;i<n;i++)
      {
         ar[i]=in.nextInt(); 
        
      }
      for(int j=1;j<=k;j++)
      { int count=0;
         for(int h=0;h<n;h++)
         {
             if(j == ar[h])
             {
              count++; 
             }
           
           
         }
        System.out.println(j+" "+count);
        
      }
    }
}