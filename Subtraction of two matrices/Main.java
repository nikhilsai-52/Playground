import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix[i][j] = in.nextInt();
      }
    }
    int matrix2[][] = new int[r][c];
    for(int i = 0; i < r; i++){
      for(int j = 0; j < c; j++){
        matrix2[i][j] = in.nextInt();
      }
    }
    int s[][] = new int[c][r];
    for(int i = 0; i <= r-1; i++){
      for(int j = 0; j <= c-1; j++){
        s[i][j] = matrix[i][j]-matrix2[i][j]; 
      }
    }
    for(int i = 0; i <= c-1; i++){
      for(int j = 0; j <= r-1; j++){
        System.out.print(s[i][j] + " ");
      }
      System.out.println();
    }
  }
}