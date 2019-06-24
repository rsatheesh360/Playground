import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		// Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int alter = 0;
      for(int row = 1; row <= n; row++)
      {
        for(int col = 1; col <= row; col++)
        {
          if(alter == 0)
          {
            System.out.print("*");
            alter = 1;
          }
          else
          {
            System.out.print("#");
             alter = 0;
          }
        }
        System.out.print("\n");
    }
      in.close();
    }
}