import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
          Scanner in = new Scanner(System.in);
          int arr_size = in.nextInt();
          int arr[] = new int[arr_size];
          for (int i=0;i<arr_size;i++)
          {
        	  arr[i]=in.nextInt();
        	
         }
          seg(arr_size,arr);
	
          for (int i=0;i<arr_size;i++)
          {
        	  System.out.print(arr[i]+" ");
        	
         }
	
	
	}
	public static void seg(int arr_size,int arr[])
	{
		int zero_count=0;
		for(int i=0;i<arr_size;i++)
		{
			if(arr[i]==0)
				zero_count++;
			
			
		}
		int pos_count = arr_size - zero_count;
		int pos[] = new int[pos_count];
		int k=0;
		for(int i=0;i<arr_size;i++)
		{
			if(arr[i]!=0)
			{	
				pos[k]=arr[i];
			     k++;
			}
		}
		for(int i=0;i<k;i++)
		{
			arr[i]=pos[i];
		}
		for(int i=0;i<zero_count;i++)
		{
			arr[pos_count]=0;
		     pos_count++;
		}
		
		
	}

}