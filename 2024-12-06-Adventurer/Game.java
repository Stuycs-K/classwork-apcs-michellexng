import java.util.Scanner;
public class Game{
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    Adventurer p1 = new CodeWarrior();
    Adventurer p2 = new Warrior("Tim");
    System.out.println(p1.getName()+", "+p1.getHP()+"/"+p1.getmaxHP()+" HP, "+p1.getSpecial()+"/"+p1.getSpecialMax()+" "+p1.getSpecialName());
    System.out.println(p2.getName()+", "+p2.getHP()+"/"+p2.getmaxHP()+" HP, "+p2.getSpecial()+"/"+p2.getSpecialMax()+" "+p2.getSpecialName());
    System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
    // String userName = userInput.nextLine();
    // //Do something with the input
    // System.out.println("Username is: " + userName);
  }
}
