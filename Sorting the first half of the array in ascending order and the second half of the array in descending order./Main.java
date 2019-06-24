import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i < n; i++)
    {
      list[i] = sc.nextInt();
    }
    insertion_sort(n, list);
  }
  public static void insertion_sort(int n, int list[])
  {
    for(int j = 1; j < n / 2; j++)
  {
    int del = list[j];
    int k = j - 1;
      while((k >= 0) && (list[k] > del))
      {
        list[k + 1] = list[k];
        k--;
      }
      list[k + 1] = del;
    }
    for(int j = n / 2; j < n; j++)
    {
      int del = list[j];
      int k = j - 1;
      while((k >= n / 2) && (list[k] < del))
      {
        list[k + 1] = list[k];
        k--;
      }
      list[k + 1] = del;
      }
      for(int ind = 0; ind < n; ind++)
      {
           System.out.print(list[ind]+ " ");
      }
  }
}