import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
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
    for(int idx = 1; idx < n/2; idx++)
    {
      int key = list[idx];
      int idx2 = idx - 1;
      while((idx2 >= 0) && (list[idx2] > key))
      {
        list[idx2 + 1] = list[idx2];
        idx2--;
      }
      list[idx2 + 1] = key;
    }
    for(int i = 0; i < n; i++)
    {
       System.out.print(list[i]+ " ");
    }
  }
}