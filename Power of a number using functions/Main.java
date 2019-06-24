import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int expo = in.nextInt();
    System.out.print(power(base,expo));
  }
  public static int power(int base, int expo)
  {
    int power = 1;
    while(expo >= 1)
    {
      power = power * base;
      expo--;
    }
    return power;
  }
}