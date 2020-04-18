import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for(int i=0; i<n ;i++)
      {
         arr[i] = in.nextInt();
      }
      int key = in.nextInt();
      int key2 = in.nextInt();
      int count=0;
      int count1=0;
      for(int i = 0; i<n ;i++)
      {
           if(arr[i] == key)
           {
             System.out.println(i); 
             count++;
           }
           
       }
         if(count == 0)
           System.out.print("-1");
      
      
        for(int i = 0; i<n ;i++)
      {
           if(arr[i] == key2)
           {
             System.out.println(i); 
             count1++;
           }
           
       }
       if(count1 == 0)
         System.out.print("-1");
    }
}