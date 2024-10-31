import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc1 = new Scanner("This is a bunch of words");
    while(sc1.hasNext()){
      System.out.println(sc1.next());
    }
  }
}
