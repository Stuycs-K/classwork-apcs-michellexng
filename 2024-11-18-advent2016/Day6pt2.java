import java.util.*;
import java.io.*;

public class Day6pt2{
  public static String message (String[] input){
    String code = "";
    for (int i = 0; i < input[0].length(); i++){
      int[] count = new int[26];

      for (int j = 0; j < input.length; j++){
        char current = input[j].charAt(i);
        count[current - 'a']++;
        }

      int minCount = input.length;
      char letter = 'a';
      for (int n = 0; n < 26; n++){
        if ((count[n] < minCount) && (count[n] != 0)){
          minCount = count[n];
          letter = (char)(n + 'a');
        }
      }
      code+=letter;
    }
    return code;
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
