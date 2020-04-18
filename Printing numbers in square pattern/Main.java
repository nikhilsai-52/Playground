import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int number_of_rows = in.nextInt();
      for( int row_number = 1 ; row_number <= number_of_rows ; row_number++)
      {
             for( int col_number = 1 ; col_number <= number_of_rows ; col_number++)
             {
                 System.out.print(row_number); 
             }
             System.out.print("\n");
       }
	}
}