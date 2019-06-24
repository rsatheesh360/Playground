import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = greatest_two_num(n1,n2);
      System.out.print(greatest_two_num(result,n3));
    }
  public static int greatest_two_num(int num1, int num2)
  {
    int max_num = 0;
    if(num1 > num2)
    {
      max_num = num1;
    }
    else
    {
      max_num = num2;
    }
    return max_num;
  }
}
                       
	