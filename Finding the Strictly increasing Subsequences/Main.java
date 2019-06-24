import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int arr_size = sc.nextInt();
    int arr[] = new int[arr_size];
    for(int i = 0; i < arr_size; i++)
    {
      arr[i] = sc.nextInt();
    }
    int sum_arr[] = new int [3 * arr_size];
    inc_sub_array(arr_size, arr, sum_arr);
  }
  public static void inc_sub_array( int arr_size, int arr[], int sum_arr[])
  {
    for(int j = 0; j <= arr_size - 1; j++)
    {
      int key = arr[j];
      int flag = 1;
      for(int k = j + 1; k <= arr_size - 1; k++)
      {
        if(arr[k] > key)
        {
          for(int l = j; l <= k; l++)
          {
            if(arr[l] > arr[k])
              flag = 0;
          }
          if(flag == 1)
          System.out.println(key+","+arr[k]+" ");
        }
        flag = 1;
      }
    }
  }
}