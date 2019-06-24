import java.util.Scanner;
class Main{
  public static void main(String args[]) 
  {
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    int col_count = in.nextInt();
    StringBuilder str = new StringBuilder(string);
    int str_len = str.length();
    delete_spaces(str, str_len);
    str_len = str.length();
    int row_count = str_len / col_count;
    if((str_len % col_count) > 0)
    {
      row_count++;
    }
    for(int col = 0; col < col_count; col++)
    {
      for(int row = 0; row < row_count; row++)
      {
        int curr_char = col + (row * col_count);
          if(row % 2 == 1)
          {
            int char_idx = (col_count - 1) + (row * col_count);
             curr_char = char_idx - col;
          }
        char ch;
        if(curr_char >= str_len)
        {
          ch = 'X';
        }
        else{
          ch = str.charAt(curr_char);
        }
        System.out.print(ch);
      }
    }
  }
  public static void delete_spaces(StringBuilder str, int str_len)
  {
    StringBuilder temp = new StringBuilder("");
    for(int i = 0; i < str_len; i++)
    {
      if(str.charAt(i) != ' ')
      {
         temp.append(str.charAt(i));
      }
    }
    str.setLength(0);
    int temp_len = temp.length();
    for(int i = 0; i < temp_len; i++)
    {
      str.append(temp.charAt(i));
    }
  }
}