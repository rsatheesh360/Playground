import java.util.Scanner;
class Main
{
 public static int[] count_Array(String str){ 
    //type your code here
    int count[] = new int[256];
    for(int i = 0; i < str.length(); i++)
    {
      count[str.charAt(i)]++;
    }
    return count;
  }
  public static String remove_Chars(String str,String sub_str)
  {
    int count[] = count_Array(sub_str);
    int ip = 0, res = 0;
    char arr[] = str.toCharArray();
    while(ip != arr.length)
    {
      char temp = arr[ip];
      if(count[temp] == 0)
      {
        arr[res] = arr[ip];
        res++;
      }
      ip++;
    }
    str = new String(arr);
    return str.substring(0, res);
  }
public static void main(String[] args)
{
  Scanner sc = new Scanner (System.in);
  String str = sc.nextLine();
  String sub_str = sc.nextLine();
  System.out.print(remove_Chars(str,sub_str));
 }
}