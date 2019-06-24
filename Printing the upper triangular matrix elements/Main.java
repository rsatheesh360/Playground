import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int [][] mat = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        mat[i][j] = sc.nextInt();
      }
    }
    upper_matrix(r, c, mat);
  }
  public static void upper_matrix(int r, int c, int[][] mat)
  {
    for(int k = 0; k < c; k++)
    {
      for(int i = 0, j = k; j < c; i++, j++)
      {
        System.out.print(mat[i][j]+" ");
      }
    }
   }
}