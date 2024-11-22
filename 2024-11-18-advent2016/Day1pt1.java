import java.util.*;
import java.io.*;

public class Day1pt1{
  public static int move (String[] input){
    int x = 0;
    int y = 0;
    int direction = 0;
    int[] xDir = {0, 1, 0, -1};
    int[] yDir = {1, 0, -1, 0};

    for (int i = 0; i < input.length; i++){
      int steps = Integer.parseInt(input[i].substring(1));
      char turn = input[i].charAt(0);

      if (turn == 'L'){
        direction = (direction + 3) % 4;
      }
      else if (turn == 'R'){
        direction = (direction + 1) % 4;
      }

      x += xDir[direction]*steps;
      y += yDir[direction]*steps;
      }
    return Math.abs(x)+Math.abs(y);
  }

  public static void main(String[] args){
    try{
      File file = new File("2024d1.txt");
      Scanner scanInput = new Scanner(file);
      String[] input = scanInput.nextLine().split(", ");
      System.out.println(move(input));
    } catch (FileNotFoundException e){
      System.out.println("file not found");
    }
  }
}
