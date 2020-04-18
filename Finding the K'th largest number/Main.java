import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      // Type your code here
      int count=0;
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int ar[]=new int[n];
      for(int i=0;i<n;i++)
      {
        ar[i]=in.nextInt();
      }
      int k = in.nextInt();
      bs(ar,n);
      for(int j=n-1;j>0;j--)
      {  count++;
           if(count==k)
           {
            System.out.print(ar[j]);
             break;
           }
      }
    }
  public static void bs(int ar[],int n)
  {
     for(int i=0;i<n;i++)
     {  
       for(int j=0;j<n-1;j++)
       { int temp=0;
           if(ar[j]>ar[j+1]) 
           {
              temp=ar[j+1];
             ar[j+1]=ar[j];
             ar[j]=temp;
             
           }
         
       }
       
       
     }
    
    
    
  }
}