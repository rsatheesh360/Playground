import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      for(int inx = 1; inx <= r; inx++)
      {
        for(int idx = c; idx > c - inx; idx--)
        {
          System.out.print(idx);
        }
        for(int idx = 1; idx<= c - inx; idx++)
        {
          System.out.print(r - inx + 1);
        }
        System.out.println();
      }
    }
}