import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int ar[] = new int[n];
    for(int i=0;i<n;i++)
    {
     ar[i] = in.nextInt(); 
    }
    for(int i=0;i<(n/2 - 1) ;i++)
    {
     for(int j=0;j<(n/2 - 1);j++)
     {  int t=0;
       if(ar[j]>ar[j+1])
       {
         t=ar[j];
         ar[j]=ar[j+1];
         ar[j+1]=t;
       }
     }
    }
    for(int k=0;k<n;k++)
    {
     System.out.print(ar[k]+" "); 
      
    }
  }
}