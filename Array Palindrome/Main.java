import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      int count=0;
      boolean isValid = false;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[] = new int[n];
      for(int i=0;i<n;i++)
      {
       ar[i]=in.nextInt(); 
      }
      int left=0;
      int right=n-1;
      while(left<right)
      {
         if(ar[left]==ar[right])
         {
           isValid = true;
         }
        else
        {
           isValid = false;
        }
        left++;
        right--;
      }
      if(isValid == true)
      {
       System.out.print("Yes"); 
        
      }
      else
      {
        System.out.print("No");
      }
      

        
   }
}
