import java.util.*;
import java.io.*;

public class Day2{
  public static int bathCode (String[] input){
    int[][] keypad = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    //keypad array indexes
    int x = 1;
    int y = 1;

    for (int i = 0; i < input.length; i++){
        for (int j = 0; j < input[i].length(); j++){
            char turn = input[i].charAt(j);

            if (turn == 'U' && x > 0){
                x--;
            }
            if (turn == 'D' && x < 2){
                x++;
            }
            if (turn == 'R' && y < 2){
                y++;
            }
            if (turn == 'L' && y > 0){
                y--;
            }
        }
    }
    return keypad[x][y];
  }

  public static void main(String[] args){
    try{
      File file = new File("2024d2.txt");
      Scanner scanInput = new Scanner(file);
      List<String> inputList = new ArrayList<>();
      
      while (scanInput.hasNextLine()){
        inputList.add(scanInput.nextLine());
      }

      String[] input = inputList.toArray(new String[0]);
      System.out.println(bathCode(input));
    } catch (FileNotFoundException e){
      System.out.println("file not found");
    }
  }
}
