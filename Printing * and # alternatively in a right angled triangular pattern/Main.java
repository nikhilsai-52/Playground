import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		// Type your code here
         int number_of_rows = in.nextInt();
         int count1=1;
         for( int row_number = 1; row_number<=number_of_rows ;row_number++)
         {
            for(int col_number= 1; col_number<=row_number ;col_number++)
            {   
              if(count1%2!=0)
               System.out.print("*");
              else
                 System.out.print("#");
              count1++;
             }
             System.out.print("\n");
           
         }
       
    }
}