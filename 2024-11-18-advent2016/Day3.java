import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Day3{
  public static boolean isTriangle(String sides){
    Scanner input = new Scanner(sides);
    int[] side = new int[3];
    int i = 0;
    while (input.hasNext()){
      side[i]=input.nextInt();
      i++;
    }
    return ((side[0] + side[1] > side[2]) && (side[1]+side[2] > side[0]) && (side[0] + side[2] > side[1]));
  }
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int result = 0;
      while(input.hasNextLine()){
        if(isTriangle(input.nextLine())){
          result++;
        }
      }
      input.close();
      return result;
    } catch(FileNotFoundException ex){
        System.out.println("file not found");
        return 0;
    }
  }
  public static int countTrianglesB(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int result = 0;
      String triangle = "";
      String triangle1 = "";
      String triangle2 = "";
      while (input.hasNextInt()){
        for (int i = 0; i < 3; i++){
            triangle+= input.nextInt()+ " ";
            triangle1+= input.nextInt()+ " ";
            triangle2+= input.nextInt()+ " ";
        }
        if (isTriangle(triangle)){
          result++;
        }
        if (isTriangle(triangle1)){
          result++;
        }
        if (isTriangle(triangle2)){
          result++;
        }
        triangle = "";
        triangle1 = "";
        triangle2 = "";
      }
      input.close();
      return result;
    } catch (FileNotFoundException ex){
      System.out.println("file not found");
      return 0;
    }
  }
  public static int countComplexFile(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int result = 0;
      String[] nums;
      String newTriangle;
      while (input.hasNextLine()){
        nums = input.nextLine().split("x");
        newTriangle = Integer.parseInt(nums[0])+" "+Integer.parseInt(nums[1])+" "+Integer.parseInt(nums[2]);
        if (isTriangle(newTriangle)){
          result++;
        }
        nums = new String[] {};
        newTriangle = " ";
      }
      return result;
    } catch(FileNotFoundException ex){
        System.out.println("file not found");
        return 0;
    }
  }

  public static void main(String[] args){
    System.out.println(countTrianglesA("2024d3.txt"));
    System.out.println(countTrianglesB("2024d3.txt"));
  //  System.out.println(countComplexFile("2024d3.txt"));
  }
}
