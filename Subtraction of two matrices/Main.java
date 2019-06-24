import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int m1[][] = new int[r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
        m1[i][j] = sc.nextInt();
      }
    }
    int m2[][] = new int [r][c];
    for(int i = 0; i < r; i++)
    {
      for(int j = 0; j < c; j++)
      {
         m2[i][j] = sc.nextInt();
      }
    }
    int sum[][] = new int[r][c];
    subtraction(m1, m2, sum);
    display(sum);
  }
  public static void subtraction( int m1[][], int m2[][], int sum[][])
  {
    for(int i = 0; i <= sum.length - 1; i++)
    {
      for(int j = 0; j <= sum[i].length - 1; j++)
      {
        sum[i][j] = m1[i][j] - m2[i][j];
      }
    }
  }
public static void display(int matrix[][])
{
  for(int i = 0; i <= matrix.length - 1; i++)
  {
    for(int j = 0; j <= matrix[i].length - 1; j++)
    {
      System.out.print(matrix[i][j]+" ");
    }
    System.out.println();
  }
 }
}