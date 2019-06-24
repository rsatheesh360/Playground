import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for(int index = 0; index <= arr_size-1; index++)
      {
        arr[index] = in.nextInt();
      }
      subsets_of_size_3(arr_size, arr);
    }
  public static void subsets_of_size_3(int arr_size,int arr[])
  {
    for(int ind = 0; ind <= arr_size - 2; ind++)
    {
      for(int inde = ind + 1; inde <= arr_size - 1; inde++)
      {
        for(int inx = inde + 1; inx <= arr_size - 1; inx++)
        {
          System.out.print("("+ arr[ind]+ "," + " " +arr[inde] + "," +" " +arr[inx]+")"+" ");
        }
      }
      System.out.println();
    }
}
}