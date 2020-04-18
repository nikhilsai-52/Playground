import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++)
    {
     ar[i]=in.nextInt(); 
    }
    for(int i=0;i<n;i++)
    { int t=0;
     for(int j=i;j<n;j++)
     {  if(t<ar[j])
       {
       if(ar[i]<ar[j])
       { 
        System.out.print(ar[i]+","+ar[j]); 
         System.out.print("\n");
         t=ar[j];
       }
       }
       
     }
      
    }
  }
}