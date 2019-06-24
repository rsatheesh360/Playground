import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0; index <= arr_size - 1; index++)
      {
        arr[index] = in.nextInt();
      }
      int value = in.nextInt();
      perfect_couple(arr_size,arr,value);
    }
  public static void perfect_couple(int arr_size, int arr[],int value)
  {
    for(int inx = 0; inx <= arr_size - 1; inx++)
    {
      for(int ind = inx + 1; ind <= arr_size - 1; ind++)
      {
        int sum = arr[inx] + arr[ind];
        if(sum == value)
        {
          System.out.println(arr[inx]+","+" "+arr[ind]);
        }
      }
    }
}
}