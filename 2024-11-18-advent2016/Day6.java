import java.util.*;
import java.io.*;

public class Day6{
  public static String message (String[] input){
    int count = 0;
    for (int i = 0; i < input[i].length; i++){
      for (int j = 0; j < input.length; j++){
        if (input[i].charAt(j) == input[j].charAt(j)){

        }
      }
    }
  }

  public static void main(String[] args){
    try{
      File file = new File("2024d6.txt");
      Scanner scanInput = new Scanner(file);
      ArrayList<String> inputList = new ArrayList<String>();

      while (scanInput.hasNextLine()){
        inputList.add(scanInput.nextLine());
      }

      String[] input = inputList.toArray(new String[0]);
      System.out.println(message(input));
    } catch (FileNotFoundException e){
      System.out.println("file not found");
    }
  }
}
