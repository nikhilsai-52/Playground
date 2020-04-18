import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int rows= in.nextInt();
       for (int i=1; i<=rows; i++) 
        { 
            // Print space in decreasing order 
            for (int j=rows; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}