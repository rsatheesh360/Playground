import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner sc = new Scanner(System.in);
      int choice = sc.nextInt();
      switch(choice)
      {
        case 1:
          int s = sc.nextInt();
          int sqrt = s * s;
          System.out.println(sqrt);
          break;
          
        case 2:
          int l = sc.nextInt();
          int b = sc.nextInt();
          int rec = l * b;
          System.out.println(rec);
          break;
          
        case 3:
          int h = sc.nextInt();
          int base = sc.nextInt();
          int tri = (h * base) / 2;
          System.out.println(tri);
          break;
          
        case 4:
          int r = sc.nextInt();
          double circle = 3.14 * r * r;
          System.out.println(circle);
          break;
      }
      
    }
}